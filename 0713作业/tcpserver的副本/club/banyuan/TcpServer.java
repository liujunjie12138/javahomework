package club.banyuan;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(5555);
        System.out.println("启动服务器");
        Socket socket=serverSocket.accept();
        System.out.println(socket.getInetAddress().getHostAddress());
        InputStream inputStream=socket.getInputStream();
        byte[] bytes=new byte[2048];
        int count=inputStream.read(bytes);
        System.out.println("读取数据");
        System.out.println(new String(bytes,0,count));
        System.out.println("发送数据");
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("收到".getBytes());
    }
}
