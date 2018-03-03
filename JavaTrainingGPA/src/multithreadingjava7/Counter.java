/*
 * Counter is a common used instance by 2 parallel threads
 */
package multithreadingjava7;

/**
 * Counter is a common used instance by 2 parallel threads
 * @author gheor
 */
public class Counter {
    private volatile int c = 0;//var. comuna

    synchronized public void  increment() {
        c++;
    }
    synchronized public void decrement() {
        c--;
    }
    synchronized public int value() {
        return c;
    }
}
