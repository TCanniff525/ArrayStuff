/*
 * Programmer:
 * Date:
 * Purpose:
 */

import java.util.Scanner;

public class ArrayStuff {
    public static void main (String[] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // PART A
        int [] ages = new int [5];

        ages[2] = 18;

        System.err.println("Enter an integer:");
        ages[0] = input.nextInt();
        
        ages[4] = ages[0] * ages[0];

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        // PART B
        String [] planets = {
        		"Mercury" ,
        		"Venus" ,
        		"Earth" ,
        		"Mars" ,
        		"Jupiter" ,
        		"Saturn" ,
        		"Uranus" ,
        		"Neptune" ,
        };
     
        System.out.println(planets[6].charAt(0));
       

       System.out.println("What do you want to rename earth?");
       planets[2] = input.next();
       
     
        planets[0] = planets[2].toUpperCase();


        // TODO: Print all of the elements of "planets" in reverse order.
        for( int count= planets.length -1; count>= 0; count--) {
        	System.out.println(planets[count]);
        }
    }
}
