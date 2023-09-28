//import java.io.*;
//import java.net.*;
//
//public class Server {
//    public static void main(String[] args)throws IOException {
//
//        DatagramSocket server = new DatagramSocket(4160);
//
//        byte[] buf = new byte[1024];
//
//        DatagramPacket packet = new DatagramPacket(buf, buf.length);
//
//        server.receive(packet);
//        String response = new String(packet.getData());
//
//        System.out.println("Response Data: "+response);
//
//        server.close();
//    }
//}

import java.io.*;
import java.net.*;


public class Server {
    public static void main(String[] args)throws Exception {
        DatagramSocket server = new DatagramSocket(4160);

        byte[] buf = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        server.receive(packet);
        String response = new String(packet.getData());

        System.out.println("Response Data: "+response);

        server.close();

    }
}