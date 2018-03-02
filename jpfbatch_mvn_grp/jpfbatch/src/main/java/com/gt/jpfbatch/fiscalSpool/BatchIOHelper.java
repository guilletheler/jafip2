/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.jpfbatch.fiscalSpool;

import com.gt.jpfbatch.JpfbatchConfigs;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author John Doe
 */
public class BatchIOHelper {

    BatchPojo batchPojo;

    JpfbatchConfigs configs;

    public BatchIOHelper(JpfbatchConfigs configs) {
        this.configs = configs;
    }

    public void loadFromFile(File file) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(file);
        this.loadFromStream(fis);
    }

    public void loadFromBytea(byte[] bytea) throws UnsupportedEncodingException {
        batchPojo = new BatchPojo();
        batchPojo.setBatch(new String(bytea, configs.getCharset()));
        batchPojo.setSeparador(configs.getSep());
        batchPojo.setCharset(configs.getCharset());
    }

    public void loadFromStream(InputStream inputStream) throws IOException {
        byte[] bytea = IOUtils.toByteArray(inputStream);
        this.loadFromBytea(bytea);
    }

    public void writeToFile(File file) {

        if (file.exists()) {
            file.delete();
        }

        try (Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), configs.getCharset()))) {
            out.write(batchPojo.getResultado());
            if (!batchPojo.getErrores().isEmpty()) {
                out.write("\n");
                out.write(batchPojo.getErrores());
            }
            out.flush();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(BatchIOHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BatchIOHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public BatchPojo getBatchPojo() {
        return batchPojo;
    }

    public void setBatchPojo(BatchPojo batchPojo) {
        this.batchPojo = batchPojo;
    }

}
