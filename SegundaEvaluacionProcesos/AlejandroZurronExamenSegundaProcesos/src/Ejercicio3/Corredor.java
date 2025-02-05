package Ejercicio3;

import java.util.Iterator;


public class Corredor implements Runnable{
String nombre;
int velocidad;
long tiempo;
private static final Object lock = new Object();

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getVelocidad() {
	return velocidad;
}
public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}
public long getTiempo() {
	return tiempo;
}
public void setTiempo(long tiempo) {
	this.tiempo = tiempo;
}

public Corredor(String nombre, int velocidad, long tiempo) {
	super();
	this.nombre = nombre;
	this.velocidad = velocidad;
	this.tiempo = tiempo;
}
@Override
public void run() {
	// TODO Auto-generated method stub
	
	if (nombre.contentEquals("1")) {
		corredor1();
	}else if(nombre.contentEquals("2")){
		corredor2();
	}else if(nombre.contentEquals("3")){
		corredor3();
	}else if(nombre.contentEquals("4")){
		corredor4();
	}else if(nombre.contentEquals("5")){
		corredor5();
	}else if(nombre.contentEquals("6")){
		corredor6();
	}
	
}

public void corredor1(){
	try {
		for (int i = 0; i < 50; i++) {
			Thread.sleep(getVelocidad());
			System.out.print("Calle 1:");
			for (int j = 0; j <50 ; j++) {
				if (j==i) {
					System.out.print(1);
				}
				System.out.print("-");
			}
			System.out.println();
		}
		System.out.println("He tardado "+((System.nanoTime()-tiempo)/1e9)+"segundos");
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void corredor2(){
	try {
		for (int i = 0; i < 50; i++) {
			Thread.sleep(getVelocidad());
			System.out.print("Calle 2:");
			for (int j = 0; j <50 ; j++) {
				if (j==i) {
					System.out.print(2);
				}
				System.out.print("-");
			}
			System.out.println();
		}
		System.out.println("He tardado "+((System.nanoTime()-tiempo)/1e9)+"segundos");
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void corredor3(){
	try {
		for (int i = 0; i < 50; i++) {
			Thread.sleep(getVelocidad());
			System.out.print("Calle 3:");
			for (int j = 0; j <50 ; j++) {
				if (j==i) {
					System.out.print(3);
				}
				System.out.print("-");
			}
			System.out.println();
		}
		System.out.println("He tardado "+((System.nanoTime()-tiempo)/1e9)+"segundos");
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void corredor4(){
	try {
		for (int i = 0; i < 50; i++) {
			Thread.sleep(getVelocidad());
			System.out.print("Calle 4:");
			for (int j = 0; j <50 ; j++) {
				if (j==i) {
					System.out.print(4);
				}
				System.out.print("-");
			}
			System.out.println();
		}
		System.out.println("He tardado "+((System.nanoTime()-tiempo)/1e9)+"segundos");
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void corredor5(){
	try {
		for (int i = 0; i < 50; i++) {
			Thread.sleep(getVelocidad());
			System.out.print("Calle 5:");
			for (int j = 0; j <50 ; j++) {
				if (j==i) {
					System.out.print(5);
				}
				System.out.print("-");
			}
			System.out.println();
		}
		System.out.println("He tardado "+((System.nanoTime()-tiempo)/1e9)+"segundos");
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void corredor6(){
	try {
		for (int i = 0; i < 50; i++) {
			Thread.sleep(getVelocidad());
			System.out.print("Calle 6:");
			for (int j = 0; j <50 ; j++) {
				if (j==i) {
					System.out.print(6);
				}
				System.out.print("-");
			}
			System.out.println();
		}
		System.out.println("He tardado "+((System.nanoTime()-tiempo)/1e9)+"segundos");
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}





}
