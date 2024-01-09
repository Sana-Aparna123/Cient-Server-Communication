import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
//one way communication
public class ClientDemo2 {
	public static void main(String[] args) {
		
			try {
				Socket csoc=new Socket("localhost",4000);
				OutputStream os = csoc.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				
//				InputStream is = csoc.getInputStream();
//				DataInputStream dis = new DataInputStream(is);
				
				Scanner scan=new Scanner(System.in);
				String msg=scan.nextLine();
				dos.writeUTF(msg);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
