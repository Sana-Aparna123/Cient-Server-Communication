import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
	public static void main(String[] args) {
		
			try {
				Socket csoc=new Socket("localhost",4000);
				OutputStream os = csoc.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				
				InputStream is = csoc.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				Scanner scan=new Scanner(System.in);
				String str=scan.nextLine();
				dos.writeUTF(str);
				String vcountString = dis.readUTF();
				String ccountString = dis.readUTF();
				
				System.out.println("the vowel count is:"+vcountString);
				System.out.println("the consonat counnt is:"+ccountString);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
