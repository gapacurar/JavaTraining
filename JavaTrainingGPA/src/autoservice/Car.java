/*
 * Class Car
 */
package autoservice;

//import com.sun.javafx.geom.Curve;

/**
 * 
 * @author gheor
 */
public class Car implements Saleable, Rentable{
    
    public enum Culoare {RED, YELLOW, BLUE, BLACK, WHITE};
    public enum Marca {MERCEDES, RENAULT, DACIA};
    
    private Culoare carColor = Culoare.BLACK;
    private double speed = 0.0;
    private Marca name = Marca.DACIA; 
    
    private double rentingPrice = 0;

    public void setRentingPrice(double rentingPrice) {
        this.rentingPrice = rentingPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }
    private double salesPrice = 0;
    
    
    @Override
    public double getSalesPrice() {
        return salesPrice;
    }

    @Override
    public double getDailyRentingPrice() {
        return rentingPrice;
    }
    
    Car(Marca nouaMarca, Culoare nouaCuloare, double nouaViteza, double newRentingPrice, double newSalesPrice){
        salesPrice = newSalesPrice;
        rentingPrice = newRentingPrice;
        carColor = nouaCuloare;
        name = nouaMarca;
        speed = nouaViteza;
    }
    
    
    
}
