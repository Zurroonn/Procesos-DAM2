package ProcessBuilping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessBuilping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder process=new ProcessBuilder("ping","github.com");
		
		
		try {
			Process empezar= process.start();
			InputStream ips= empezar.getInputStream();
			BufferedReader reader= new BufferedReader(new InputStreamReader(ips));
			String linea="";
			while ((linea=reader.readLine())!=null) {
				System.out.println(linea);
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
