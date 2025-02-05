package Ejercicio2;

import java.util.Iterator;
import java.util.Random;

public class Cajero implements Runnable {

	private String nombre;
	private long tiempo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public Cajero(String nombre, long tiempo) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	public void caja() {
		
		Random random= new Random();
		Cliente cliente= new Cliente();
//		random.nextInt(5,10)
		try {
			
		for (int i = 0; i <random.nextInt(5,10) ; i++) {
			System.out.println("Buenas, soy "+getNombre()+" llevo "+i+" clientes y llevo trabajando "+((System.nanoTime()-tiempo)/1e9)+"segundos");
			for (int j = 0; j <cliente.getProductos(); j++) {				
				Thread.sleep(random.nextInt(1,3)*100);
			}
			System.out.println("Adios, se despide "+getNombre()+" llevo "+ (i+1)+" clientes y llevo trabajando desde "+((System.nanoTime()-tiempo)/1e9)+"segundos");
			
		}
		
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
	@Override
	public void run() {
	caja();
	}
}
