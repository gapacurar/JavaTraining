/*
 * Class adds one to Counter
 */
package multithreadingjava7;

/**
 * Class adds one to Counter
 * @author gheor
 */
public class Add extends Thread{
    
    private Counter cAdd;
    
    public Add(Counter counterFromMain){
        cAdd = counterFromMain;
    }
    @Override
    public void run(){
        //Counter c = new Counter();
        for(int i=0;i<500;i++){
            cAdd.increment();
            System.out.println("Incremented to: "+cAdd.value());
        }
    }
}
