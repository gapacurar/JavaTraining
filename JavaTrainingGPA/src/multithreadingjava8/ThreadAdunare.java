/*
 * Thread Adunare
 */
package multithreadingjava8;

/**
 * Thread Adunare
 * @author gheor
 */
public class ThreadAdunare extends Thread{
    
    Contor contorLocalAdunare;
    
    public ThreadAdunare(Contor c){
        contorLocalAdunare = c;
    }
    @Override
    public void run(){
        for(int i=0;i<500;i++)
            contorLocalAdunare.add();
    }
}
