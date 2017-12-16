/*
 * Women character
 */
package family;

/**
 *
 * @author gheor
 */
public class Woman extends Thread{
    
    private Boolean isSleeping = true;
    private Cigar tigara;

    public void setIsSleeping(Boolean isSleeping) {
        this.isSleeping = isSleeping;
    }
    
    public Woman(Cigar c){
        tigara = c;
    }
    
    @Override
    public void run(){
        System.out.println("Woman is sleeping...and snoring");
        while(isSleeping){
        }
        System.out.println("Woman is looking the TV");
    }
}
