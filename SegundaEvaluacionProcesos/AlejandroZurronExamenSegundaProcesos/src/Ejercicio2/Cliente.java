package Ejercicio2;

import java.util.Random;

public class Cliente   {
	int productos;
	
	public Cliente() {
		super();
		Random random= new Random();
		this.productos = random.nextInt(20);		
	}

	public int getProductos() {
		return productos;
	}

	public void setProductos(int productos) {
		this.productos = productos;
	}
		
		
		}

	
