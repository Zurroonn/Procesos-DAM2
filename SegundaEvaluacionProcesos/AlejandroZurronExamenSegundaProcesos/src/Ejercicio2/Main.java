package Ejercicio2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long tiempoi=System.nanoTime();
		for (int i = 0; i <10; i++) {
			Cajero fsf = new Cajero("Cajero "+i,tiempoi);
			new Thread(fsf).start();
		}
		while (Thread.activeCount() > 1) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("El hilo principal fue interrumpido.");
            }
        }
		System.out.println("El supermercado ha estado abierto durante "+ ((System.nanoTime()-tiempoi)/1e9)+"segundos");

	}
		
}
