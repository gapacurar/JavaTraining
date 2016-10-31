/*
 * Class Dereptunghi extends FiguraGeometrica
 */
package unittest;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Dreptunghi extends FiguraGeometrica{
    
    private double lungime;
        
    private double latime;

    /**
     *
     * @param lungime lungimea dreptunghiului
     * @param latime latimea dreptunghiului
     * @param originx originea pe axa x dreptunghiului
     * @param originy originea pe axa y dreptunghiului
     */
    public Dreptunghi(double lungime, double latime, double originx, double originy) {
        super.setOriginX(originx);
        super.setOriginY(originy);
        this.lungime = lungime;
        this.latime = latime;
    }

    
    /**
     * Get the value of latime
     *
     * @return the value of latime
     */
    public double getLatime() {
        return latime;
    }

    /**
     * Set the value of latime
     *
     * @param latime new value of latime
     */
    public void setLatime(double latime) {
        this.latime = latime;
    }


    /**
     * Get the value of lungime
     *
     * @return the value of lungime
     */
    public double getLungime() {
        return lungime;
    }

    /**
     * Set the value of lungime
     *
     * @param lungime new value of lungime
     */
    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    @Override
    public void draw() {
        System.out.println("unittest.Dreptunghi.draw()");
    }

    
}
