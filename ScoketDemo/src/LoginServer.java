import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//��������
public class LoginServer {
	public static void main(String[] args) {
		try {
			//���տͻ�������
			//����һ��socket
			ServerSocket serverSocket=new ServerSocket(5000);
			//ʹ��accept()���������յ���ServerSocket������
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
