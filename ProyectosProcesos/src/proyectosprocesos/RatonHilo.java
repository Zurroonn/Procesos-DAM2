/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectosprocesos;

/**
 *
 * @author aazur
 */
public class RatonHilo implements Runnable {
	
	private String nombre;
	private int tiempoAlimentacion;
	private int alimentoConsumido = 0;
	
	public RatonHilo(String nombre, int tiempoAlimentacion) {
		super();
		this.nombre = nombre;
		this.tiempoAlimentacion = tiempoAlimentacion;
	}

	public void comer() {
		try {
			System.out.printf("El ratón %s ha comenzado a alimentarse%n", nombre);
			Thread.sleep(tiempoAlimentacion * 1000);
			System.out.printf("El ratón %s ha terminado de alimentarse%n", nombre);
			alimentoConsumido++;
			System.out.printf("Alimento consumido:%d%n", alimentoConsumido);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		this.comer();
	}
	
	public static void main(String[] args) {
		/**RatonHilo Alex = new RatonHilo("Alex", 4);
		new Thread(Alex).start();
		new Thread(Alex).start();
		new Thread(Alex).start();
		new Thread(Alex).start();	**/
		RatonHilo Alex = new RatonHilo("Alex", 4);
		for (int i=0; i<100; i++) {
			new Thread(Alex).start();
		}
	}
}
