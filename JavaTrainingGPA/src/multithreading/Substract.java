/*
 * Thread that substracts value of contor
 */
package multithreading;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Substract extends Thread{
    
    Contor localNameOfContor;

    public Substract(Contor localNameOfContor) {
        this.localNameOfContor = localNameOfContor;
    }
    
    
    @Override
    public void run(){
        substractOne(localNameOfContor);
    }
    
    public void substractOne(Contor c){
        for(int i=0;i<500;i++){
          c.decrementeazaContor();
        }
    }  
}
