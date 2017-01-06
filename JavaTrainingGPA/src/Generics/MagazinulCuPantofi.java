/*
 * a-sti.ro
 */
package Generics;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class MagazinulCuPantofi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pantofi oPereche = new Pantofi();
        oPereche.setCuloarePantof(Pantofi.Culoare.NEGRU);
        CutiePentruPantofi cutiaPentruPantofi = new CutiePentruPantofi();      
        cutiaPentruPantofi.setP(oPereche);
        // punem un Intreg in cutie pentru intregi
        CutiePentruIntregi cutiaPentruIntregi = new CutiePentruIntregi();
        cutiaPentruIntregi.setValoare(Integer.MAX_VALUE);
        //cutie generica pentru pantofi
        Box<Pantofi> shoeBox = new Box<>();
        shoeBox.set(oPereche);
        Box<Integer> integerBox = new Box<>();
        integerBox.set(Integer.SIZE);
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(10.2);
        
        
    }
    
}
