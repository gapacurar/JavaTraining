/*
 * a-sti.ro
 */
package Generics;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Pantofi {
    
    public enum Culoare{FUCHSIA, NEGRU, BEJ, ALB, GALBEN}
    float marime;

    public float getMarime() {
        return marime;
    }

    public void setMarime(float marime) {
        this.marime = marime;
    }

    public Culoare getCuloarePantof() {
        return culoarePantof;
    }

    public void setCuloarePantof(Culoare culoarePantof) {
        this.culoarePantof = culoarePantof;
    }
    Culoare culoarePantof;
    
}
