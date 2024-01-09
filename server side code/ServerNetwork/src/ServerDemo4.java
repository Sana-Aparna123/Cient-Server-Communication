import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo4 {

	public static void main(String[] args) {
		try {
			ServerSocket listener = new ServerSocket(4000);
			System.out.println("server is ready to accept request");
			
			Socket ssoc=listener.accept();
			InputStream is = ssoc.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			OutputStream os = ssoc.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<5;i++) {
			String msg=dis.readUTF();
			System.out.println(msg);
			msg=sc.nextLine();
			dos.writeUTF(msg);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
