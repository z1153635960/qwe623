import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端
public class LoginClient {
	public static void main(String[] args) {
		try {
			//发送请求到服务器
			//创建一个客户端的Socket
			Socket socket=new Socket("localhost",5000);
			//通过输出流发送请求
			String info="用户名是：Tom,密码:123456";
			OutputStream os=socket.getOutputStream();
			InputStream is=socket.getInputStream();
			ObjectOutputStream oos=new ObjectOutputStream(os);
			String reply=null;
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			while(!((reply=br.readLine())==null)) {
				System.out.println("我是客户端，服务器响应为："+reply);
			}
			oos.close();
			is.close();
			os.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
