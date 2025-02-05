package Ejercicio3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenidos a la pista de atletismo");
		System.out.println("Los corredores ya estan preparados");
		System.out.println("Calle 1:1--------------------------------------------------");
		System.out.println("Calle 2:2--------------------------------------------------");
		System.out.println("Calle 3:3--------------------------------------------------");
		System.out.println("Calle 4:4--------------------------------------------------");
		System.out.println("Calle 5:5--------------------------------------------------");
		System.out.println("Calle 6:6--------------------------------------------------");
		
		for (int i = 1; i < 7; i++) {
			Random random= new Random();
			int velocidad= random.nextInt(500,2000);
			String numcorredor=""+i;
			Corredor corredor= new Corredor(numcorredor,velocidad,System.nanoTime());
			new Thread(corredor).start();
		}
		while (Thread.activeCount() > 1) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("El hilo principal fue interrumpido.");
            }
        }
		System.out.println("Los corredores han finalizado");

	}

}
