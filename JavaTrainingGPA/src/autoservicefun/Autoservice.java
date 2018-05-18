/*
 * Autoservice
 */
package autoservicefun;

/**
 *
 * @author gheor
 */
public class Autoservice {

    /**
     * Autoservice class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create 3 cars
        Masina mertzan = new Masina("MERCEDES",230,Masina.Culoare.GREEN);
        Masina dacia = new Masina("DACIA",180,Masina.Culoare.MAGENTA);
        Masina logan = new Masina("LOGAN",210,Masina.Culoare.BLUE);
        
        mertzan.setMarca("MERCEDES");
        mertzan.setVitezaMaxima(260);
        mertzan.setCuloare(Masina.Culoare.RED);
        
        
        
        
    }
    
}
