/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gatorflow1;

/**
 *
 * @author vinay
 */
import java.io.*;
import java.net.*;
import java.lang.*;

public class GatorFlow1 {

    private static int port;
  
    public static void main(String[] args) {
            
        InetAddress addr;
        try {
            
            addr = InetAddress.getByName("127.0.0.1");
            String address = "127.0.0.1";
            System.out.println(addr);
            port = 6633;
            HelloMessage hM = new HelloMessage();
            
            Socket MySocket = new Socket(addr,port);
            DataOutputStream dr = new DataOutputStream(MySocket.getOutputStream());
            byte as[] = new byte[8];
            as[0] = hM.version();
            as[1] = hM.type();
            as[2] = (byte)(hM.length()>>> 8);
            as[3] = (byte)(hM.length());
            as[4] = (byte)(hM.getXid()>>> 24);
            as[5] = (byte)(hM.getXid()>>> 16);
            as[6] = (byte)(hM.getXid()>>> 8);
            as[7] = (byte)(hM.getXid());
            for(int i=0;i<8;i++){
                System.out.println(as[i]);
            }
            System.out.println(as.length);
            
            dr.write(as, 0, as.length);
            dr.flush();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
}
