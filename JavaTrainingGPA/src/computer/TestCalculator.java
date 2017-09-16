package computer;

/*
 * Tests Calculator
 */

/**
 * Class TestCaluclator tests Calculator
 * @author gheor
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // create a Calculator instance
       Calculator computer = new Calculator();
       // start the Calculator 
       computer.start();
       // test the add of 123 + 223
       computer.add();
       // test 233-122
       computer.descrease();
       // test 123*12
       computer.multiply();
       // test 24:6
       computer.divide();
    }
    
}
