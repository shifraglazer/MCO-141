import java.util.Scanner;
public class InputValidation{
  public static void main(String args []){
    
    Scanner keyboard= new Scanner(System.in);
    
    System.out.println("Enter a number in the " + "range of 1 through 100: ");
    int number= keyboard.nextInt();
    
    //validate the input
    while(number < 1 || number > 100){
      System.out.println("That number is invalid.");
      System.out.print("Enter a number in the " + "range of 1 through 100: ");
      number= keyboard.nextInt();
    }
  }

}