/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaflow;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class Cycles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* if
        int i = 30;
        
        if (i<40){
            System.out.println("i is < " + 40);
        }
        else{
            System.out.println("i is >= " + 40);
        }
        // switch
        switch(i){
            case 10: 
                System.out.println("10");
                break;
            case 20: 
                System.out.println("20");
                break;
            case 30: 
                System.out.println("30");
                break;
            default: 
                System.out.println("Default");
                break;        
        }
        // while
        while(i<40){
            System.out.println(i);
            i = i + 1;
        }
        //do while
        String culoare = "rosu";
        do{
            System.out.println("Nu ar trebui sa se execute daca este rosu");
            culoare = "noncularea neagra";
        }while(culoare.equals("rosu"));
        // for
        for(int viezure = 0;viezure<10;viezure++){
            System.out.println("Viezurele este: "+ viezure);
        /*/ 
        int[] numbers = { 10, 20, 30, 40, 50 };

	int sum = 0;
	for (int x : numbers) {
		if (x == 30) {
			continue;
		}
			
		sum += x;
		
		if (sum > 100) {
			break;
		}
		System.out.print(x);
		System.out.print("\n");
		
	}
		
	System.out.print("sum: " + sum);
        }
        
}
