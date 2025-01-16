/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectosprocesos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aazur
 */
public class RatonPrueba extends Thread{
String nombre;
int tiempo;

    public RatonPrueba(String nombre, int tiempo) {
        super();
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
   public void comerxd(){
       
    try {
        
        Thread.sleep(tiempo*1000);
        System.out.println("El raton "+nombre+" termino de mamar bicho");
    } catch (InterruptedException ex) {
        Logger.getLogger(RatonPrueba.class.getName()).log(Level.SEVERE, null, ex);
    }
       
   }
   @Override
   public void run(){
       comerxd();
   }
   
   public static void main(String[] args) {
   Raton jero= new Raton("que",5);
       jero.start();
   
   }
}
