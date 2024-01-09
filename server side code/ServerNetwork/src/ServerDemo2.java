import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//one way communication
public class ServerDemo2 {
	public static void main(String[] args) {
		try {
			ServerSocket listener=new ServerSocket(4000);
			System.out.println("Server is ready to accept the request");
			
			Socket ssoc=listener.accept();
			InputStream is = ssoc.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
//			OutputStream os = ssoc.getOutputStream();
//			DataOutputStream dos = new DataOutputStream(os);
			
			String msg = dis.readUTF();
			
			System.out.println(msg);
			
			

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
