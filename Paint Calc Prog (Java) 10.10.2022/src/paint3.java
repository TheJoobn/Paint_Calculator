
//SUBMISSION 1
// 		10/9/2022 11:01 PM

//  CLASS DESCRIPTION 1:
//      This class takes in wall width and height as input, validates the input, then calculates
//      and outputs the area of the wall and the amount of paint needed to paint it.
//      Validation for - negative numbers, 0, and characters that we do not want.

//-------------------------------------------------------------------------------------------

//SUBMISSION 2
//      10/12/2022 2:49 AM

//      EDITED/NEW LINES:  (40-44)  AND  (141-149)

//  CLASS DESCRIPTION 2:   
//      This class now has a cansPaintNeeded variable that takes the gallonsPaintNeeded variable
//      and rounds that answer up to output the amount of paint cans the user needs to buy.

//-------------------------------------------------------------------------------------------
//STEP_NUMBER_0                                                                                        

import java.util.Scanner;

public class Paint3 {
    public static void main(String[] args) {

        // This creates an object for the scanner class.
        Scanner scnr = new Scanner(System.in);

        // These declare the variables.
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        final double squareFeetPerGallons = 350.0;
        
//-------------------------------------------------------------------------------------------  
    //NEW EDIT FOR cansPaintNeeded variable
    
        double cansPaintNeeded = 0.0;
        
        
//-------------------------------------------------------------------------------------------
//STEP_NUMBER_1   -   Implement a do-while loop to ensure input is valid.
        
        // A do-while loop to ensure input is valid.
        do {
        	
        	// Asks user for measurement input
            System.out.println("Enter the HEIGHT of the wall in FEET: ");
            
            // Loop helps check for any characters entered instead of numbers
            while (!scnr.hasNextDouble()) {
            	
            	// Outputs invalid answer and asks for a new measurement.
            	System.out.println("\n\t*INVALID ANSWER*");
            	System.out.println("Do not type in any characters, only numbers.");
            	System.out.println("Enter the HEIGHT of the wall in FEET: ");
            	
            	// Scans for next input number
            	scnr.next();
            	
            }//ENDOF: WHILE
            
            // Gets new value for wall height. 
            wallHeight = scnr.nextDouble();
            
            // Checks our wall height to make sure numbers are positive. Outputs invalid if not.
            if(wallHeight <= 0) {
            	System.out.println("\n\t*INVALID ANSWER*");
            	System.out.println("Do not type in any negative numbers or 0.");
            	
            }// ENDOF: if
        }// ENDOF: do
        
        // This happens as long as the input for wall height is less than or equal to 0.
        while(wallHeight <= 0); 
        
        
//-------------------------------------------------------------------------------------------     
//STEP_NUMBER_2   -   Implement a do-while loop to ensure input is valid

        // A do-while loop to ensure input is valid.
        do {
        	
        	// Asks user for measurement input
            System.out.println("Enter the WIDTH of the wall in FEET: ");
            
            // Loop helps check for any characters entered instead of numbers
            while (!scnr.hasNextDouble()) {
            	
            	// Outputs invalid answer and asks for a new measurement.
            	System.out.println("\n\t*INVALID ANSWER*");
            	System.out.println("Do not type in any characters, only numbers.");
            	System.out.println("Enter the WIDTH of the wall in FEET: ");
            	
            	// Scans for next input number
            	scnr.next();
            	
            }//ENDOF: WHILE
            
            // Gets new value for wall height. 
            wallWidth = scnr.nextDouble();
            
            // Checks our wall width to make sure numbers are positive. Outputs invalid if not.
            if(wallWidth <= 0) {
            	System.out.println("\n\t*INVALID ANSWER*");
            	System.out.println("Do not type in any negative numbers or 0.");
            	
            }// ENDOF: if
        }// ENDOF: do
        
        // This happens as long as the input for wall width is less than or equal to 0.
        while(wallWidth <= 0); 
        
        
//-------------------------------------------------------------------------------------------       
//STEP_NUMBER_3   -   Calculate and output wall area
       
        // This calculates wall area by multiplying width by height.
        wallArea = wallHeight * wallWidth;

        // This prints the wall area in square feet along with a message to user.
        System.out.println("\nWall area:  " + wallArea + " square feet");
        
        
//-------------------------------------------------------------------------------------------
//STEP_NUMBER_4	  -   Calculate and output the amount of paint (in gallons) needed to paint the wall    
        
        // This calculates the amount of paint needed by dividing the 
        //wall area by the squared feet per gallons variable.
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;

        // This prints the gallons of paint needed to paint the wall.
        System.out.println("Paint needed:  " + gallonsPaintNeeded + " gallons");
        
        
//-------------------------------------------------------------------------------------------       
    //NEW EDITs FOR cansPaintNeeded
        
        // This rounds up the number of gallons of paint needed to paint the wall. 
        cansPaintNeeded = Math.ceil(gallonsPaintNeeded);
        
        // This outputs to user how many cans of paint they need to buy.
        System.out.println("Cans needed: " + cansPaintNeeded + " can(s)");
        
        
//-------------------------------------------------------------------------------------------
//ENDERS      
        
    }//ENDOF: public static void main(String[] args)

}//ENDOF: public class Paint1 {