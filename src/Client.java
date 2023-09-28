//import java.io.*;
//import java.net.*;
//import java.util.Scanner;
//
//public class Client {
//    public static void main(String[] args) throws Exception {
//
//        DatagramSocket client = new DatagramSocket();
//
//        InetAddress add = InetAddress.getByName("localhost");
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your message: ");
//        String str = sc.nextLine();
//
//        byte[] buf = str.getBytes();
//
//        DatagramPacket p = new DatagramPacket(buf, buf.length, add, 4160);
//
//        client.send(p);
//        client.close();
//    }
//}

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)throws Exception {
        DatagramSocket client = new DatagramSocket();

        InetAddress add = InetAddress.getByName("localhost");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your message: ");
        String str = sc.nextLine();

        byte[] buf = str.getBytes();

        DatagramPacket p = new DatagramPacket(buf, buf.length, add, 4160);

        client.send(p);
        client.close();


    }
}