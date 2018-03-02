/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.gt.ifepson.IFEpsonHelper;
import com.gt.ifepson.capaFisica.EpsonFiscalDriverJNA;
import com.gt.jpfbatch.JpfbatchConfigs;
import com.gt.jpfbatch.fiscalSpool.BatchExecutor;
import com.gt.jpfbatch.fiscalSpool.BatchPojo;
import com.gt.jpfbatch.fiscalSpool.impresores.IImpresor;
import com.gt.jpfbatch.fiscalSpool.impresores.ImpresorFiscal;
import com.gt.jpfbatch.net.server.TCPServer;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author John Doe
 */
public class CompiladorBatchTest {

    public CompiladorBatchTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        

    }

    @After
    public void tearDown() {
//        if (epsonDriver != null) {
//            epsonDriver.ClosePort();
//        }
        TCPServer.detener();
    }

//    @Test
//    public void imprimirTiqueTest() {
//
//        System.out.println("charset default " + Charset.defaultCharset());
//        
//        //this.ejecutar(batch);
//        
//        BatchPojo bp = null; // = new BatchPojo();
//
//        //bp.setSeparador("\\|");
//        
//        //bp.setBatch(batch);
//
//        BatchIOHelper batchIOHelper = new BatchIOHelper(this.getConfigs());
//        
//        try {
//            batchIOHelper.loadFromFile(new File(this.getConfigs().getInFile()));
//            bp = batchIOHelper.getBatchPojo();
//        } catch (IOException ex) {
//            Logger.getLogger(CompiladorBatchTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        TCPServer.listen(this.getConfigs());
//                
//        BatchPojo ret = TCPClient.serverExec(this.getConfigs(), bp);
//        
//        batchIOHelper.setBatchPojo(ret);
//        
//        System.out.println(ret.getResultado());
//        
//        String outFile = this.getConfigs().getOutFile();
//        
//        if(outFile == null || outFile.isEmpty()) {
//            outFile = this.getConfigs().getInFile().substring(0, this.getConfigs().getInFile().lastIndexOf(".")) + this.getConfigs().getOutExt();
//        }
//        
//        System.out.println("Escribiendo salida en " + outFile);
//        
//        batchIOHelper.writeToFile(new File(outFile));
//                
//        TCPServer.stop();
//    }
    
    @Test
    public void inFilesTest() {

    }

//    @Test
//    public void cierreZTest() {
//
//        String batch = "CierreZ()";
//        
//        this.ejecutar(batch);
//        
//    }
//    @Test
//    public void cargarLogo() {
//
//        List<String> comandos = new ArrayList<>();
//
//        try {
//
//            BufferedImage origimage = ImageIO.read(new File("/home/prog/java_mvn/fiscal/version_2/jpfbatch_mvn_grp/logo_carnave_bw.png"));
//            BufferedImage image = scale(origimage, 50, 50);
//            byte[][] pixels = new byte[image.getWidth()][];
//
//            comandos.add("IniciarCargaDeLogosDelUsuario()" + image.getHeight() + "|" + image.getWidth()  + "|1\n");
//
//            for (int x = 0; x < image.getWidth(); x++) {
//                pixels[x] = new byte[image.getHeight()];
//
//                for (int y = 0; y < image.getHeight(); y++) {
//                    pixels[x][y] = (byte) (image.getRGB(x, y) == 0xFFFFFFFF ? 0 : 1);
//                }
//            }
//
//            for (byte[] bytea : pixels) {
//                comandos.add("EnviarDatosDeLogoDelUsuario()" + ComandoFiscal.bytesToHex(bytea, image.getHeight()) + "\n");
//            }
//
//            comandos.add("TerminarCargaDeLogoDelUsuario()\n");
//
//        } catch (IOException ex) {
//            Logger.getLogger(CompiladorBatchTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        //System.out.println(sbbatch.toString());
//        for (String s : comandos) {
//            System.out.println("ejecutando " + s);
//            if(this.ejecutar(s).contains("RetornoComando: CONFIGURACION cod: 1318")) {
//                break;
//            }
//        }
//    }
//    
//    public static BufferedImage scale(BufferedImage imageToScale, int dWidth, int dHeight) {
//        BufferedImage scaledImage = null;
//        if (imageToScale != null) {
//            scaledImage = new BufferedImage(dWidth, dHeight, imageToScale.getType());
//            Graphics2D graphics2D = scaledImage.createGraphics();
//            graphics2D.drawImage(imageToScale, 0, 0, dWidth, dHeight, null);
//            graphics2D.dispose();
//        }
//        return scaledImage;
//    }
    IImpresor impresor = null;

    private JpfbatchConfigs getConfigs() {
        JpfbatchConfigs configs = new JpfbatchConfigs();
        
        configs.setBaudRate(9600);
        configs.setSerialPort(1);
        configs.setHostName("localhost");
        configs.setTcpPort(6932);
        configs.setSep("\\|");
        configs.setInFile("/home/prog/java_mvn/fiscal/version_2/jpfbatch_mvn_grp/jpfbatch/src/main/resources/tique.in");
        configs.setCharset("UTF-8");
        return configs;
    }
    
    private IImpresor getImpresor() {
        if (impresor == null) {
            EpsonFiscalDriverJNA epsonDriver = IFEpsonHelper.newEpsonFiscalDriver();
            System.out.println("Abriendo puerto");
            int ret = IFEpsonHelper.openPort(epsonDriver, 1, 9600);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CompiladorBatchTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("resultado de abrir el puerto " + ret + " estado " + impresor.getState());
            
            impresor = new ImpresorFiscal();
            ((ImpresorFiscal) impresor).setEpsonDriver(epsonDriver);
            
        }
        return impresor;
    }

    private String ejecutar(String batch) {

        BatchPojo bp = new BatchPojo();

        bp.setSeparador("\\|");

        bp.setBatch(batch);

        BatchExecutor be = new BatchExecutor(bp);
        //be.compilar();

        be.ejecutar(this.getConfigs());

        Assert.assertEquals(1, 1);

        System.out.println(be.getBatchPojo().getResultado());

        return be.getBatchPojo().getResultado();
    }

    public static void convertToHex(PrintStream out, File file) throws IOException {
        InputStream is = new FileInputStream(file);

        int bytesCounter = 0;
        int value = 0;
        StringBuilder sbHex = new StringBuilder();
        StringBuilder sbText = new StringBuilder();
        StringBuilder sbResult = new StringBuilder();

        while ((value = is.read()) != -1) {
            //convert to hex value with "X" formatter
            sbHex.append(String.format("%02X ", value));

            //If the chracater is not convertable, just print a dot symbol "."
            if (!Character.isISOControl(value)) {
                sbText.append((char) value);
            } else {
                sbText.append(".");
            }

            //if 16 bytes are read, reset the counter,
            //clear the StringBuilder for formatting purpose only.
            if (bytesCounter == 15) {
                sbResult.append(sbHex).append("      ").append(sbText).append("\n");
                sbHex.setLength(0);
                sbText.setLength(0);
                bytesCounter = 0;
            } else {
                bytesCounter++;
            }
        }

        //if still got content
        if (bytesCounter != 0) {
            //add spaces more formatting purpose only
            for (; bytesCounter < 16; bytesCounter++) {
                //1 character 3 spaces
                sbHex.append("   ");
            }
            sbResult.append(sbHex).append("      ").append(sbText).append("\n");
        }

        out.print(sbResult);
        is.close();
    }
}
