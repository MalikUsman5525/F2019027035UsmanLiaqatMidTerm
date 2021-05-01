/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.term;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Malik Usman
 */
public class Server {
     public static void main(String[] args)  {
        try {
            ServerSocket ss = new ServerSocket(786);
            
            System.out.println("Connecting");
            Socket Akbar = ss.accept();//The Connect is established 
            System.out.println(" Connected");
            
            DataInputStream dis = new DataInputStream(Akbar.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            
            ss.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
