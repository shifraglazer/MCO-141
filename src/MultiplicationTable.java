import java.util.Scanner;

public class MultiplicationTable{
  public static void main(String args []){
 
    Scanner keyboard= new Scanner(System.in);
    System.out.println("Enter max number");
    int max= keyboard.nextInt();
    
    for(int i=1; i<=max; i++){
      for(int j=1; j<=max; j++){
        
        int multiply= i*j;
      
      System.out.print(multiply+"\t"); 
      }
      System.out.println();
    }
  
  
  
  }

}