package club.banyuan;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UpdServer {
    public static void main(String[] args) throws IOException {
        String msg ="0";
        while (!msg.equals("quite")) {
            DatagramSocket socket = new DatagramSocket(3333);
            byte[] bytes = new byte[0x10000];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            socket.receive(packet);
            socket.close();
            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());
            msg = new String(packet.getData(), 0, packet.getLength());
            System.out.println(msg);
        }
    }
}
