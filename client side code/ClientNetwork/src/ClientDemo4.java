import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo4 {

	public static void main(String[] args) {
		try {
			Socket csoc=new Socket("localhost",4000);
			
			OutputStream os = csoc.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			InputStream is = csoc.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<5;i++) {
			String msg=sc.nextLine();
			dos.writeUTF(msg);
		    msg = dis.readUTF();
			System.out.println(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
