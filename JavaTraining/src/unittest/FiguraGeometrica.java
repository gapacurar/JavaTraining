/*
 * Abstract Geometrical figure
 */
package unittest;

/**
 *
 * @author gheorgheaurelpacurar
 */
public abstract class FiguraGeometrica {
    
    private double originX;
    
    private double originY;

    /**
     * Get the value of originY
     *
     * @return the value of originY
     */
    public double getOriginY() {
        return originY;
    }

    /**
     * Set the value of originY
     *
     * @param originY new value of originY
     */
    public void setOriginY(double originY) {
        this.originY = originY;
    }


    /**
     * Get the value of originX
     *
     * @return the value of originX
     */
    public double getOriginX() {
        return originX;
    }

    /**
     * Set the value of originX
     *
     * @param originX new value of originX
     */
    public void setOriginX(double originX) {
        this.originX = originX;
    }

    public abstract void draw();
    
}
