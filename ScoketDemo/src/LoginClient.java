import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//�ͻ���
public class LoginClient {
	public static void main(String[] args) {
		try {
			//�������󵽷�����
			//����һ���ͻ��˵�Socket
			Socket socket=new Socket("localhost",5000);
			//ͨ���������������
			String info="�û����ǣ�Tom,����:123456";
			OutputStream os=socket.getOutputStream();
			InputStream is=socket.getInputStream();
			ObjectOutputStream oos=new ObjectOutputStream(os);
			String reply=null;
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			while(!((reply=br.readLine())==null)) {
				System.out.println("���ǿͻ��ˣ���������ӦΪ��"+reply);
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
