import java.util.Scanner;

public class ReverseNumbers{
  public static void main(String args []){
    
    Scanner keyboard= new Scanner(System.in);
    int [] numbers= new int [10];
    System.out.println("Enter 10 numbers:");
    
    for(int i=0; i<10;i++){
      numbers [i]=keyboard.nextInt();
    }
    
    for(int i=9; i>-1;i--){
      System.out.println(numbers [i]);
    }
  }
  
}