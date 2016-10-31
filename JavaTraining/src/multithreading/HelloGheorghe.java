/*
 * Hello Ionel
 */
package multithreading;

/**
 * Hello Ionel
 * @author gheorgheaurelpacurar
 */
public class HelloGheorghe extends Thread{
    @Override
    public void run() {
        System.out.println("Hello Gheorghe!");  
        System.out.println("HelloGheorghe thread name is: "+this.getName());
        System.out.println("HelloGheorghe thread state is: "+this.getState());
        this.interrupt();
    }
    
}
