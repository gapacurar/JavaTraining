/*
 * Class decrease the value of a counter
 */
package multithreadingjava7;

/**
 * Class decrease the value of a counter
 * @author gheor
 */
public class Substract extends Thread{
    
    private Counter cSub;
    
    public Substract(Counter counterFromMain){
        cSub = counterFromMain;
    }
    @Override
    public void run(){
        //Counter c = new Counter();
        for(int i=0;i<500;i++){
            cSub.decrement();
            System.out.println("Decremented to: "+cSub.value());
        }
    }
}
