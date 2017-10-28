/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author gheor
 */
public class BasicMathDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;
        System.out.printf("The absolute value " + "of %.3f is %.3f%n", a, Math.abs(a));
        System.out.printf("The ceiling of " + "%.2f is %.0f%n", b, Math.ceil(b));
        System.out.printf("The floor of " + "%.2f is %.0f%n", b, Math.floor(b));
        System.out.printf("The rint of %.2f " + "is %.0f%n", b, Math.rint(b));
        System.out.printf("The max of %d and " + "%d is %d%n",c, d, Math.max(c, d));
        System.out.printf("The min of of %d " + "and %d is %d%n",c, d, Math.min(c, d));
        // exponential demo
        double x = 11.635;
        double y = 2.76;
        System.out.printf("The value of " + "e is %.4f%n",Math.E);
        System.out.printf("exp(%.3f) " + "is %.3f%n",x, Math.exp(x));
        System.out.printf("log(%.3f) is " + "%.3f%n",x, Math.log(x));
        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n",x, y, Math.pow(x, y));
        System.out.printf("sqrt(%.3f) is " + "%.3f%n",x, Math.sqrt(x));
        // trigonometric demo
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);
        System.out.format("The value of pi " + "is %.4f%n",Math.PI);
        System.out.format("The sine of %.1f " + "degrees is %.4f%n",degrees, Math.sin(radians));
        System.out.format("The cosine of %.1f " + "degrees is %.4f%n",degrees, Math.cos(radians));
        System.out.format("The tangent of %.1f " + "degrees is %.4f%n",degrees, Math.tan(radians));
        // random number generated between 0.0 and 0.1 and multiplied with 10
        int randomNumber = (int)(Math.random() * 10);
        System.out.println(randomNumber + "is a random number");
        randomNumber = (int)(Math.random() * 10);
        System.out.println(randomNumber + "is a random number");
        randomNumber = (int)(Math.random() * 10);
        System.out.println(randomNumber + "is a random number");
    }
}
