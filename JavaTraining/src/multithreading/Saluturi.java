/*
 * Launch 2 threads to say hello Ionel and Gheorghe
 */
package multithreading;

/**
 * Launch 2 threads to say hello Ionel and Gheorghe
 * @author gheorgheaurelpacurar
 */
public class Saluturi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Thread tIonel = new SalutIonel();
        Thread tGheorghe = new HelloGheorghe();
        System.out.println(tIonel.getState());
        System.out.println(tGheorghe.getState());
        
        tIonel.setPriority(10);
        System.out.println("Threadul lui Ionel are prioritatea: "+tIonel.getPriority());
        tGheorghe.setPriority(1);
        tIonel.start();
        tGheorghe.start();
        System.out.println("Threadul lui Gheorghe are prioritatea: "+tGheorghe.getPriority());
        
        tIonel.stop();
        tGheorghe.stop();
        System.out.println(tIonel.getState());
        System.out.println(tGheorghe.getState());
    }
    
}
