package com.example.demo1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
    String host;
    int port;
    Socket clientSocket;
    OutputFile out;
     Client(String host, int port, OutputFile out) {
         this.host = host;
         this.port = port;
         this.out = out;
         if(out == null){
             System.out.println("[ERROR] the output file in invalid");
         }
         try {
             this.clientSocket = new Socket(host, port);
         } catch (IOException e)
         {
             e.printStackTrace();
         }

     }

     Client()
     {
         this.host = "localhost";
         this.port = 1234;
         try{
             this.clientSocket = new Socket("localhost", 1234);
         } catch (IOException e)
         {
             e.printStackTrace();
         }

     }

     public Status listening(Client client) throws IOException {
         if(client == null)
         {
             System.out.println("[ERROR] null client object.");
             return Status.INVALID_ARGUMENTS;
         }
         if(client.clientSocket == null)
         {
             BufferedWriter buf = new BufferedWriter(new FileWriter(this.out.getPath());
             buf.write("[ERROR] the socket is dead :(");
         }
         Scanner socketScanner = new Scanner(this.clientSocket.getInputStream());
         P

     }





}
