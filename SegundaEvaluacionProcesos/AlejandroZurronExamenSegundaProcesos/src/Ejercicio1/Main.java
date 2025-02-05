package Ejercicio1;

import java.util.Iterator;
import java.util.Random;
//Clase del hilo donde vamos a realizar nuestros hilos
public class Main extends Thread{
	private static final Object lock = new Object();
    
	String motivo;
	

	public Main(String nombre) {
		super(nombre);
		this.motivo = "chatgpt";
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
//Metodo donde se realiza el run
	@Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
        	synchronized (lock) {
        		//Cuando solo queden 5 hilos saltará esto
                if (Thread.activeCount() <= 5) {
                    System.out.println(getName() + ": ¡Quedamos ya sólo los 5 más lentos!");
                //Si hay más de 5 hilos seguirá esto
                } else {
                    System.out.println(getName() + " su motivo es " + getMotivo());
               }
        	}
                //El tiempo que va a esperar cada hilo, en este caso de forma aleatoria, y se multiplica x1000 para pasarlo a segundos
            try {
                Thread.sleep((random.nextInt(3) + 1) * 1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " ha sido interrumpido.");
            }
        }
        
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos 20 hilos distintos 
		for (int i = 0; i < 10; i++) {
			Main hilo= new Main("Hilo "+ i);
			hilo.start();
		}
		
		//Nos sirve para que al final del programa nos salga el ultimo System
        while (Thread.activeCount() > 1) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("El hilo principal fue interrumpido.");
            }
        }

        System.out.println("¡Programa finalizado!");
		
		
	}
	

}
