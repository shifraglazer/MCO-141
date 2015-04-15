import java.util.Scanner;
public class ATM{
  public static void main(String args []){

    Scanner keyboard= new Scanner(System.in);
    System.out.println("Do you want a reciept?");
    
    String answer= keyboard.nextLine();
    
    switch (answer.charAt(0)){
      case('y'):
      case('Y'):
        System.out.println("Printing.");
        break;
      case('n'):
      case('N'):
        System.out.println("Thank you!");
        break;
      default:
        System.out.println("Error. Please enter yes or no.");
   }
   

}


}