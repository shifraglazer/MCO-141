import java.util.Scanner;
public class Passwords {
  public static void main(String [] args){
  
    Scanner keyboard= new Scanner(System.in);
    
    System.out.println("Enter a password");
    String password1= keyboard.nextLine();
    
    System.out.println("Please confirm your password");
    String password2= keyboard.nextLine();
    
    boolean comparison= password1.equals(password2);
  
    if (comparison== true){
      System.out.println("Thank you.");
    }
    
    else {
    
    System.out.println("passwords don't match");
    }
  
   
    







}
}
