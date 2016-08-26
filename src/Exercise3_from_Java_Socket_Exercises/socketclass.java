/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3_from_Java_Socket_Exercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hamzalaroussi
 */
public class socketclass
{
   static String ip = "localhost";
   static int port = 8080;
   
    public static void main(String[] args) throws IOException
    {
        if(args.length==2)
        {
            ip = args[0];
            port = Integer.parseInt(args[1]);
        }
        ServerSocket ss = new ServerSocket();
        
        ss.bind(new InetSocketAddress(ip,port));
        System.out.println("Server started listning to port " + port + "serveradress: " + ip );
        
    while(true)
       {
        Socket link = ss.accept();
        System.out.println("Succefully connected client");
        handleClient(link);
       }
          
         
        
        
        
       
    }
    
    public static void handleClient(Socket socket)
    {
       try
       {
         Scanner scan = new Scanner(socket.getInputStream());
         PrintWriter write = new PrintWriter(socket.getOutputStream(),true);
         String msg = "";
         while(!msg.equals("close"))
         {
             if(msg.equals("abcd"))
             {
                 String lastletter = msg.substring((msg.length() - 1), msg.length()).toUpperCase();
                 write.println(lastletter + "cba");
                 
   
             } else if(msg.equals("hund"))
             {
                 write.println("dog");
             }
             else if(!msg.equals("hund") || !msg.equals("abcd"))
                     {
                        write.println(msg.toUpperCase());
                     }
             msg = scan.nextLine();
             
         }
         scan.close();
         write.close();
         socket.close();
         
       } catch (IOException ex)
       {
           Logger.getLogger(socketclass.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }
    
}
