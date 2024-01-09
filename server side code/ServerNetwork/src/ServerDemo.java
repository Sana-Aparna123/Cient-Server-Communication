import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) {
		try {
			ServerSocket listener=new ServerSocket(4000);
			System.out.println("Server is ready to accept the request");
			
			Socket ssoc=listener.accept();
			InputStream is = ssoc.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			OutputStream os = ssoc.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			String str = dis.readUTF();
			
			char strChar[]=str.toCharArray();
			int vcount=0;
			int ccount=0;
			for(int i=0;i<strChar.length;i++) {
				if(strChar[i]=='a'||strChar[i]=='e'||strChar[i]=='i'||
						strChar[i]=='o'||strChar[i]=='u') {
					vcount++;
				}
				else{
					ccount++;
				}
			}
			String vcountString = String.valueOf(vcount);
			String ccountString = String.valueOf(ccount);
			dos.writeUTF(vcountString);
			dos.writeUTF(ccountString);
			
			

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
