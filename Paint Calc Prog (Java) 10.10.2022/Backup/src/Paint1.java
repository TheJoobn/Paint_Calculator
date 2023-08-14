// 		10/6/2022 3:48 AM

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
            
            // This is the 'try' block.
            try {
                
                // This prompts the user to input the wall's height in feet.
                System.out.println("Please enter the height of the wall in feet: ");
                wallHeight = scnr.nextDouble();
                
                // This checks to see if input for wallHeight was 
                //less than or equal to 0, then throws an exception.
                if(wallHeight<=0) {
                    
                    // This throws an exception.
                    throw new Exception();
                    
                }// ENDOF: if
            }// ENDOF: try
            
            // This catches the exception.
            catch(Exception e) {
                
                // This prints a message letting the user know their input is invalid.
                System.out.println("*INVALID INPUT*");
                return;
                
            }// ENDOF: catch
        }// ENDOF: do
        
        // This happens as long as the input for wall height is less than or equal to 0.
        while(wallHeight <= 0);  
        
        
//-------------------------------------------------------------------------------------------     
//STEP_NUMBER_2   -   Implement a do-while loop to ensure input is valid

        // A do-while loop to ensure input is valid.
        do {
            
             // This is the 'try' block.
             try {
                 
                 // This prompts the user to input the wall's width in feet.
                 System.out.println("Please enter the width of the wall in feet: ");
                 wallWidth = scnr.nextDouble();

                 // This checks to see if input for wallWidth was 
                 //less than or equal to 0, then throws an exception.
                 if(wallWidth <= 0) {
                     
                     // This throws an exception.
                     throw new Exception();
                      
                 }// ENDOF: if
             }// ENDOF: try
             
             // This catches the exception.
             catch(Exception e) {
                 
                 // This prints a message letting the user know their input is invalid.
                 System.out.println("*INVALID INPUT*");
                 return; 
                 
             }// ENDOF: catch
        }// ENDOF: do
        
        // This happens as long as the input for wall width is less than or equal to 0.
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
        
        
//-------------------------------------------------------------------------------------------
//ENDERS      
        
    }//ENDOF: public static void main(String[] args)

}//ENDOF: public class Paint1 {
