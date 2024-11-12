package ProcessOrdenar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProcessOrdenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce primera ciudad");
		String ciudad1=sc.nextLine();
		System.out.println("Introduce segunda ciudad");
		String ciudad2=sc.nextLine();
		System.out.println("Introduce tercera ciudad");
		String ciudad3=sc.nextLine();
		System.out.println("Introduce cuarta ciudad");
		String ciudad4=sc.nextLine();
		File archivo= new File("archivo.txt");
		
		try {
			BufferedWriter bw= new BufferedWriter(new FileWriter(archivo));
			bw.write(ciudad1+"\n");			
			bw.write(ciudad2+"\n");
			bw.write(ciudad3+"\n");
			bw.write(ciudad4+"\n");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String [] arguments= {"sort",archivo.getAbsolutePath()}; 
		ProcessBuilder process= new ProcessBuilder(arguments);
		
		try {
			Process proceso= process.start();
			InputStream ips=  proceso.getInputStream();
			BufferedReader br= new BufferedReader(new InputStreamReader(ips));
			String linea;
			while ((linea=br.readLine())!=null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
