// 		10/9/2022 11:01 PM

//CLASS DESCRIPTION:
// This class takes in wall width and height as input, validates the input, then calculates
// and outputs the area of the wall and the amount of paint needed to paint it.

//-------------------------------------------------------------------------------------------
//STEP_NUMBER_0

import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {

        // This creates an object for the scanner class.
        Scanner scnr = new Scanner(System.in);

        // These declare the variables.
        double wallHeight = 0.0;

        double wallWidth = 0.0;

        double wallArea = 0.0;

        double gallonsPaintNeeded = 0.0;
        
        // This declares a final variable.
        final double squareFeetPerGallons = 350.0;
        
        
//-------------------------------------------------------------------------------------------
//STEP_NUMBER_1   -   Implement a do-while loop to ensure input is valid.
        
        // A do-while loop to ensure input is valid.
        do {
            System.out.println("Please enter the HEIGHT of the wall in FEET: ");
            
            while (!scnr.hasNextDouble()) {
            	
            	System.out.println("\nINVALID ANSWER, Please type in NUMBERS ONLY.");
            	System.out.println("Please enter the HEIGHT of the wall in FEET: ");
            	
            	scnr.next();
            	
            }
            wallHeight = scnr.nextDouble();
            
        }// ENDOF: do
        
        // This happens as long as the input for wall height is less than or equal to 0.
        while(wallHeight <= 0); 
        
//-------------------------------------------------------------------------------------------     
//STEP_NUMBER_2   -   Implement a do-while loop to ensure input is valid

        do {
            System.out.println("Please enter the WIDTH of the wall in FEET: ");
            
            while (!scnr.hasNextDouble()) {
            	
            	System.out.println("INVALID ANSWER, Please type in numbers ONLY.");
            	System.out.println("Please enter the WIDTH of the wall in FEET: ");
            	
            	scnr.next();
            	
            }
            wallWidth = scnr.nextDouble();

        }// ENDOF: do
        
        // This happens as long as the input for wall height is less than or equal to 0.
        while(wallWidth <= 0); 
        
        
//-------------------------------------------------------------------------------------------       
//STEP_NUMBER_3   -   Calculate and output wall area
       
        // This calculates wall area by multiplying width by height.
        wallArea = wallHeight * wallWidth;

        // This prints the wall area in square feet along with a message to user.
        System.out.println("\nThe area of the wall is:  " + wallArea + " square feet.");
        
        
//-------------------------------------------------------------------------------------------
//STEP_NUMBER_4	  -   Calculate and output the amount of paint (in gallons) needed to paint the wall     
        
        // This calculates the amount of paint needed by dividing the 
        //wall area by the squared feet per gallons variable.
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;

        // This prints the gallons of paint needed to paint the wall.
        System.out.println("The amount of paint needed is:  " + gallonsPaintNeeded + " gallons.");
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
		    	
		    }
		    
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
//ENDERS      
        
    }//ENDOF: public static void main(String[] args)

}//ENDOF: public class Paint1 {