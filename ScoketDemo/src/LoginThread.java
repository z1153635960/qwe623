import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class LoginThread extends Thread {
	public Socket socket;
	public LoginThread(Socket socket) {
		this.socket=socket;
	}
	public void run() {
		try {
			InputStream is=socket.getInputStream();
			OutputStream os=socket.getOutputStream();
			ObjectInputStream ois=new ObjectInputStream(is);
			String reply="»¶Ó­Äú£¬µÇÂ¼³É¹¦";
			ois.close();
			os.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
