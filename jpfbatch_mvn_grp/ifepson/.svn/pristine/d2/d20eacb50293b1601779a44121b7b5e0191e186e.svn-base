package com.gt.ifepson.capaFisica;

import com.sun.jna.Library;

public interface EpsonFiscalDriverJNA extends Library {

    public int SetLog(String UserParh, byte UserAction);

    public void setComPort(int portnumber);

    public int getComPort();

    public void setBaudRate(int baudRate);

    public int getBaudRate();

    public int getState();

    public int getLastError();

    public int getFiscalStatus();

    public int getPrinterStatus();

    public int getReturnCode();

    public int getExtraFieldCount();

    public void GetAPIVersion(byte[] output_buffer);

    public void OpenPort();

    public void ClosePort();

    public void Purge();

    public void AddDataField(byte[] in_buffer, int in_buffer_length);

    public void SendCommand();

    public void GetExtraField(int field_number, byte[] output_buffer, int output_buffer_length, int[] output_buffer_final_length);

    public void GetSentFrame(byte[] output_buffer, int output_buffer_length, int[] output_buffer_final_length);

    public void GetReceivedFrame(byte[] output_buffer, int output_buffer_length, int[] output_buffer_final_length);

    public void setProtocolType(int protocol);

    public void SendCommandComplete(String command);

    public int getProtocolType();

}
