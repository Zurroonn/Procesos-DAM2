package ratonprueba;



import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aazur
 */
public class RatonPrueba implements Runnable{
String nombre;
int tiempo;
int alimento=0;

    public RatonPrueba(String nombre, int tiempo) {
        super();
        this.nombre = nombre;
        this.tiempo = tiempo;
        
    }
    public void comer(){
        
    try {
        System.out.println(nombre+ " se esta alimentando");
        Thread.sleep(tiempo*1000);
        System.out.println(nombre+" termino de alimentarse");
        alimento++;
        System.out.println("Alimento "+alimento);
    } catch (InterruptedException ex) {
        Logger.getLogger(RatonPrueba.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }

    @Override
    public void run() {
        comer();
    }
    public static void main(String[] args) {
       RatonPrueba alex= new RatonPrueba("Alex", 5);
       new Thread (alex).start();
       new Thread (alex).start();
       new Thread (alex).start();
       new Thread (alex).start();
    }
    }
