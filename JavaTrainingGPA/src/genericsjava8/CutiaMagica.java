/*
 * Testing our Cutie
 */
package genericsjava8;

/**
 * Testing our cutie
 * @author gheor
 */
public class CutiaMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create two Cutie, one for Pantof and one for Cizma
        int cuc = 10;
        Cutie<Pantof> cutieDePantofi = new Cutie<>();
        Cutie<Cizma> cutieDeCizme = new Cutie<>();
        
        // create a Pantof and put it in the Cutie<Pantof>
        Pantof pantofi = new Pantof();
        cutieDePantofi.setT(pantofi);
        
        // create a Cizma and put it in Cutie<Cizma>
        Cizma cizme = new Cizma();
        cutieDeCizme.setT(cizme);
        
        //testing objects
        cutieDePantofi.getT().message();
        cutieDeCizme.getT().message();
        
        //pacalesc cutia si pun altceva decat Incaltaminte
        Integer dePusInCutie = 100;
        //Cutie<Integer> cutieAbsurdaDeIntregi = new Cutie<>();
        //cutieAbsurdaDeIntregi.setT(dePusInCutie);
        
    } 
    
}
