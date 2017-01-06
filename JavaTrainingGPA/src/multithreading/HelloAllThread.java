/*
 * a-sti.ro
 */
package multithreading;

/**
 *
 * @author gheorgheaurelpacurar
 * Implementing a new thread extending class Thread
 */
public class HelloAllThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello all!");
        System.out.println("My priority is: " + this.getPriority());
        System.out.println("My thread ID is: " + this.getId());
        System.out.println("My thread name is: " + this.getName());
        System.out.println("My thread state is: " + this.getState());
        System.out.println("My group of threads is: " + this.getThreadGroup() );
    }
}
