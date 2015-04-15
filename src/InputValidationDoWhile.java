import java.util.Scanner;

public class InputValidationDoWhile{
  public static void main (String args []){
    Scanner keyboard = new Scanner (System.in);
    int number;
    
    // boolean so can have error message
boolean firstRun=true;
    // Get and validate the input.
    do{
      // so it will not print error message until ask for first number
      if (firstRun==false){
      System.out.println("That number is invalid.");
      }
      System.out.print("Enter a number in the " +
                       "range of 1 through 100: ");
      number = keyboard.nextInt();
      //so it will print error message if first value is not valid
      firstRun= false;
    } 
    while (number < 1 || number > 100);
    
    
    
  }
}