package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {
    String host;
    int port;
    Socket clientSocket;
    PrintStream printStream;
    Scanner scanner;
    OutputFile out;
    TextArea tsend;
    TextArea trec;
    Button send;
    Button ring;

    Client(String host, int port, OutputFile out, TextArea ts, TextArea tr
            Button send, Button ring) throws IOException {
        this.host = host;
        this.port = port;
        this.out = out;
        this.tsend = ts;
        this.trec = tr;
        this.send = send;
        this.ring = ring;
        if (out == null) {
            System.out.println("[ERROR] the output file in invalid");
        }
        try {
            this.clientSocket = new Socket(host, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.printStream = new PrintStream(this.clientSocket.getOutputStream());
        this.scanner = new Scanner(this.clientSocket.getInputStream());

    }

    public boolean isAliveSocket() {
        return this.clientSocket == null;
    }

    private class ThreadHander extends Thread {


        @Override
        public void run() {
            if (!isAliveSocket()) {
                try {
                    this.clientSocket = new Socket("localhost", 1234);
                } catch (Exception e) {
                    System.out.println("the socket is dead.");
                }
            }
            while (true) {
                String msg;
                EventHandler<ActionEvent> sendEvent = new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        msg = this.tsend.
                    }
                }
            }


        }


    }
}
