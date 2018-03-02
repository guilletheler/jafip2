/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.jpfbatch.net.client;

import com.gt.jpfbatch.JpfbatchConfigs;
import com.gt.jpfbatch.fiscalSpool.BatchPojo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John Doe
 */
public class TCPClient {

    public static BatchPojo serverExec(JpfbatchConfigs configs, BatchPojo batchPojo) {

        Integer port = configs.getTcpPort();
        BatchPojo ret = null;

        if (port == null || port <= 0) {
            port = 6932;
        }

        try (Socket socket = new Socket(configs.getHostName(), port);
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream inp = new ObjectInputStream(socket.getInputStream())) {

            out.writeObject(batchPojo);
            
            try {
                ret = (BatchPojo) inp.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, "Error, clase BatchPojo no encontrada", ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ret;
    }

}
