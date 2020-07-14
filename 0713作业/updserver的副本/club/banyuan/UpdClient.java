package club.banyuan;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UpdClient {
    public static  Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
       // DatagramSocket socket=new DatagramSocket(5050);
        System.out.println("请输入你想传递的内容：");
        String word=scanner.nextLine();
        while (!word.equals("quite")){
            DatagramSocket socket=new DatagramSocket(4444);
            byte [] bytes=word.getBytes();
            DatagramPacket packet=new DatagramPacket(bytes,bytes.length,
                    InetAddress.getByName("127.0.0.1"),3333);
            socket.send(packet);
            socket.close();
            System.out.println("请输入你想传入的内容：");
            word=scanner.nextLine();
        }
    }
}
