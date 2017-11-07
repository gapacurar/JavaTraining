/* copyright a-sti.ro */
package abstractclass;
/** @author gheorgheaurelpacurar */
public abstract class Shape {
    /** coordinates of Origin of shape 2D */
    Double xOrigin = 0.0;
    Double yOrigin = 0.0;
    /** abstract method draw(),it will be implemented by each concrete shape */
    public abstract void draw();
}
