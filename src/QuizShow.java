import java.util.Scanner;
public class QuizShow{
  public static void main(String args []){
    Scanner keyboard= new Scanner(System.in);
    
    System.out.print("Which rodents first got to America by stowing away on ships?\nRats\tSquirrels\nGerbils\tBeavers\n");
    
    String answer= keyboard.nextLine();
    if(answer.equalsIgnoreCase("Rats")){
      System.out.println("Right");
    }
    else{
    System.out.println("Wrong");
    }
  
  
  }


}