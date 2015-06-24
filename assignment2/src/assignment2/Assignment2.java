/*
 *
 * Justin Goldsmith
 * June 4, 2015
 * CPT 167 Vaseashta
 * Assignment 2 - Source Code
 * 
 */

/*
Legend:


                        Wall 1
                ________________________
               |                        |
               |                        |
               |                        |
               |                        |
               |                        |
      Wall 4   |                        |   Wall 2
               |                        |
               |                        |
               |                        |
               |                        |
               |                        |
               |                        |
               |                        |
               |________________________|
                        Wall 3
*/


package assignment2;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        //variables and objects
        Scanner input = new Scanner(System.in);
        
        String name = "";
        String confirm = "";
        double w = 0.0;
        double l = 0.0;
        double h = 0.0;
        int coats = 0;
        
        double w1 = 0.0;
        double w2 = 0.0;
        double w3 = w1;
        double w4 = w2;
        
        double walls = (w1 * 2) + (w2 * 2);
        double roomDim = l * w;
        int gallons = (int) (roomDim/350);
        int brushes = (int) (roomDim/1300);
        int totalCoats = (int) (roomDim/coats);
        int totalSqft = (int) (walls + roomDim);
        
        //Greet the user and take inputs
        System.out.println("WELCOME TO JUSTIN'S ROOM PLANNER!");
        System.out.println("*********************************");
        System.out.println();
        
        System.out.print("Please enter your name: ");
        name = input.nextLine();
        System.out.println();
        
        System.out.println("Well hello, " + name + "! I'm Justin and I'll be helping you plan\nfor this project!\nSo what do you say we get started?! I'M SO EXCITED!\n");
        
        gatherInput(name, input, totalSqft, gallons, brushes, l, w, h, coats, confirm);
        
        System.out.println("OK, " + name + "! Here's what we'll need...");
        System.out.println("Your total square footage to paint: " + totalSqft);
        System.out.println("We will be applying " + coats + " coats to each surface.");
        System.out.println("You'll need " + gallons + " gallons of paint and " + brushes + " brushes to complete the job.");
    }
    
    
    public static void gatherInput(String name, Scanner input, int totalSqft, double gallons, int brushes, double l, double w, double h, int coats, String confirm) {
        System.out.println("Alright, " + name + ", What's the width of the room you want to paint?");
        System.out.print("> ");
        w = input.nextDouble();
        System.out.println("and the length?");
        System.out.print("> ");
        l = input.nextDouble();
        System.out.println();
        
        System.out.println("OK, " + name + ", how tall is the room?");
        System.out.print("> ");
        h = input.nextDouble();
        
        System.out.println("Alright, " + name + "! We're looking great! Just need to know\nhow many coats you want on each wall... ");
        System.out.print("> ");
        coats = input.nextInt();
        
        System.out.println("Great!");
        System.out.print("> ");
        confirm = input.nextLine();
        confirm = confirm.toLowerCase();
    }
    
}