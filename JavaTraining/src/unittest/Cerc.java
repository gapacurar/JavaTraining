/*
 * Class inherits FiguraGeometrica
 */
package unittest;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Cerc extends FiguraGeometrica{

        private double raza;

    /**
     *
     * @param raza raza cercului
     * @param originx coordonata x a originii
     * @param originy coordonata y a originii
     */
    public Cerc(double raza, double originx, double originy) {
        super.setOriginX(originx);
        super.setOriginY(originy);
        this.raza = raza;
    }

        
    /**
     * Get the value of raza
     *
     * @return the value of raza
     */
    public double getRaza() {
        return raza;
    }

    /**
     * Set the value of raza
     *
     * @param raza new value of raza
     */
    public void setRaza(double raza) {
        this.raza = raza;
    }

    @Override
    public void draw() {
         System.out.println("unittest.Cerc.draw()");
    }
    
}
