import java.util.Scanner;
public class TestAverage{
  public static void main(String args[]){
    
  Scanner keyboard= new Scanner(System.in);
  
  System.out.println("Enter test score (-1 at the end)");
  int testScore=keyboard.nextInt();
  
  int total=0;
  int numberOfTests=0;
  
  while(testScore != -1){
  total= total + testScore;
  numberOfTests++;
  testScore= keyboard.nextInt();//or will be infinite loop
  }
  int average= total/numberOfTests;
 System.out.println("Average= "+ average);
  }

}