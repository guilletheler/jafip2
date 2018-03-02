/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.jpfbatch;

import com.beust.jcommander.JCommander;
import com.gt.ifepson.IFEpsonHelper;
import com.gt.jpfbatch.fiscalSpool.BatchExecutor;
import com.gt.jpfbatch.fiscalSpool.BatchIOHelper;
import com.gt.jpfbatch.fiscalSpool.BatchPojo;
import com.gt.jpfbatch.net.client.TCPClient;
import com.gt.jpfbatch.net.server.TCPServer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

/**
 *
 * @author John Doe
 */
public class MainClass {

    static {
        System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");
    }

    static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(MainClass.class);

    static JpfbatchConfigs jpfbatchConfigs;

    public static void main(String[] args) {
        configLog4j();
        Properties properties = getPropertiesConfig();

        List<String> lstArgs = new ArrayList<>();

        lstArgs.addAll(Arrays.asList(args));

        for (Map.Entry entry : properties.entrySet()) {
            lstArgs.add("--" + entry.getKey().toString());
            lstArgs.add(entry.getValue().toString());
        }

        jpfbatchConfigs = new JpfbatchConfigs();

        JCommander.Builder jcommanderBuilder = JCommander.newBuilder();
        jcommanderBuilder.addObject(jpfbatchConfigs);
        JCommander jcommander = jcommanderBuilder.build();
        jcommander.setCaseSensitiveOptions(false);
        jcommander.parse(lstArgs.toArray(new String[]{}));

        if (jpfbatchConfigs.isHelp()) {
            jcommander.usage();
        }

        if (jpfbatchConfigs.isFiscalHelp()) {
            System.out.println(IFEpsonHelper.getAyuda());
        }

        if (jpfbatchConfigs.getInFile() != null && !jpfbatchConfigs.getInFile().isEmpty()) {
            switch (jpfbatchConfigs.getModo()) {
                case 0:
                    Logger.getLogger(MainClass.class.getName()).log(Level.INFO, "Se detectó configuracion para funcionar como standalone con lock tcp");
                    // standalone  TCP lock
                    TCPServer.start(jpfbatchConfigs);
                    MainClass.sendToServer(jpfbatchConfigs);
                    TCPServer.stop();
                    break;
                case 1:

                    //standalone no lock
                    break;
                case 2:
                    Logger.getLogger(MainClass.class.getName()).log(Level.INFO, "Se detectó configuracion para funcionar como servidor");
                    // start server
                    TCPServer.start(jpfbatchConfigs);
                    break;
                case 3:
                    // client
                    MainClass.sendToServer(jpfbatchConfigs);
                    break;
                case 4:
                    // stop server
                    BatchPojo batchPojo = new BatchPojo();
                    batchPojo.setStopServer(true);
                    TCPClient.serverExec(jpfbatchConfigs, batchPojo);
                    break;
            }
        } else {
            switch (jpfbatchConfigs.getModo()) {
                case 0:
                case 1:
                    //standalone no lock
                    BatchIOHelper batchIOHelper = new BatchIOHelper(jpfbatchConfigs);

                     {
                        try {
                            batchIOHelper.loadFromFile(new File(jpfbatchConfigs.getInFile()));
                            BatchPojo bp = batchIOHelper.getBatchPojo();
                            BatchExecutor be = new BatchExecutor(bp);
                            be.ejecutar(jpfbatchConfigs);
                            
                        } catch (IOException ex) {
                            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    break;
                case 2:
                    Logger.getLogger(MainClass.class.getName()).log(Level.INFO, "Se detectó configuracion para funcionar como servidor");
                    // start server
                    TCPServer.start(jpfbatchConfigs);
                    break;
                case 3:
                    break;
                case 4:
                    Logger.getLogger(MainClass.class.getName()).log(Level.INFO, "Enviando solicitud de detencion de servidor");
                    // stop server
                    BatchPojo batchPojo = new BatchPojo();
                    batchPojo.setStopServer(true);
                    TCPClient.serverExec(jpfbatchConfigs, batchPojo);
                    break;
            }
        }
    }

    private static void sendToServer(JpfbatchConfigs jpfbatchConfigs) {
        try {
            BatchIOHelper batchIOHelper = new BatchIOHelper(jpfbatchConfigs);

            batchIOHelper.loadFromFile(new File(jpfbatchConfigs.getInFile()));
            BatchPojo bp = batchIOHelper.getBatchPojo();
            BatchPojo ret = TCPClient.serverExec(jpfbatchConfigs, bp);
            batchIOHelper.setBatchPojo(ret);
            String outFile = jpfbatchConfigs.getOutFile();
            if (outFile == null || outFile.isEmpty()) {
                outFile = jpfbatchConfigs.getInFile().substring(0, jpfbatchConfigs.getInFile().lastIndexOf(".")) + jpfbatchConfigs.getOutExt();
            }
            batchIOHelper.writeToFile(new File(outFile));
        } catch (IOException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, "Error comunicando con el servidor", ex);
        }
    }

    public static String getJarPath() {
        CodeSource codeSource = MainClass.class.getProtectionDomain().getCodeSource();

        String jarDir = "";
        try {
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            jarDir = jarFile.getParentFile().getPath();
        } catch (URISyntaxException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, "Error buscando jar path", ex);
        }
        return jarDir;
    }

    private static void configLog4j() {
        configLog4j(null);
    }

    private static void configLog4j(String logFile) {
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        if (logFile == null) {
            logFile = getJarPath() + "/log4j2.xml";
        }

        Path path = Paths.get(logFile, new String[0]);

        File log4jConfigFile;

        if (Files.exists(path, new LinkOption[0])) {
            log4jConfigFile = path.toFile();
        } else {
            log4jConfigFile = new File("/home/prog/java_mvn/fiscal/version_2/jpfbatch_mvn_grp/jpfbatch/src/main/resources/log4j2.xml");
        }

        URI uri = null;

        if (log4jConfigFile.exists()) {
            uri = log4jConfigFile.toURI();
        } else {
            try {
                uri = MainClass.class.getClassLoader().getResource("log4j2.xml").toURI();
            } catch (URISyntaxException ex) {
                Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (uri != null) {
            context.setConfigLocation(uri);
        } else {
            Logger.getLogger(MainClass.class.getName()).log(Level.WARNING, "el archivo {0} no existe", logFile);
        }
    }

    public static Properties getPropertiesConfig() {

        File paramsFile = new File(MainClass.getJarPath() + "/jpfbatch.properties");

        if (!paramsFile.exists()) {
            paramsFile = new File("/home/prog/java_mvn/fiscal/version_2/jpfbatch_mvn_grp/jpfbatch/src/main/resources/jpfbatch.properties");
        }

        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(paramsFile));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, "Error leyendo configuracion", ex);
        } catch (IOException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, "Error leyendo configuracion", ex);
        }
        return properties;
    }

    public static JpfbatchConfigs getJpfbatchConfigs() {
        return jpfbatchConfigs;
    }

}
