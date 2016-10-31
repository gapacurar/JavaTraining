/*
 * Thread to add a counter variable
 */
package multithreading;

/**
 * Thread to add a counter variable
 * @author gheorgheaurelpacurar
 */
public class Add extends Thread{
    
    Contor localNameOfContor;

    public Add(Contor localNameOfContor) {
        this.localNameOfContor = localNameOfContor;
    }
    
    
    @Override
    public void run(){
        addOne(localNameOfContor);
    }
    
    public void addOne(Contor c){
        for(int i=0;i<500;i++){
          c.incrementeazaContor();
        }
    }   
}
