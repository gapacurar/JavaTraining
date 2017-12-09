/*
 * Keeps the counter
 */
package java6multithreading;

/**
 *
 * @author gheor
 */
public class Counter {
    private volatile int c = 0;//var. comuna
    private boolean canWrite = true;

    public synchronized void increment() {
        if(canWrite){
            canWrite = false;
            c++;
            canWrite = true;
        }
    }
    public synchronized void decrement() {
        if(canWrite){
            canWrite = false;
            c--;
            canWrite = true;
        }
    }
    public int value() {
        return c;
    }
}
