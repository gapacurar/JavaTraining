/*
 * Family Scene
 */
package family;

/**
 *
 * @author gheor
 */
public class FamilyScene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create instances of all actors
        Cigar tigara = new Cigar();
        Woman femeie = new Woman(tigara);
        Tv televizor = new Tv();
        VacuumCleaner aspirator = new VacuumCleaner();
        Man barbat = new Man(aspirator,femeie,televizor);
        
        //Start the threads
        tigara.start();
        televizor.start();
        aspirator.start();
        femeie.start();
        barbat.start();
        
        
    }
    
}
