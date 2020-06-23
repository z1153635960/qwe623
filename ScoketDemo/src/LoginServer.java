import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务器端
public class LoginServer {
	public static void main(String[] args) {
		try {
			//接收客户端请求
			//创建一个socket
			ServerSocket serverSocket=new ServerSocket(5000);
			//使用accept()侦听并接收到此ServerSocket的连接
			while(true) {
				Socket socket =serverSocket.accept();
				LoginThread loginThread=new LoginThread(socket);
				loginThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
