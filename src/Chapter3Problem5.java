import java.util.Scanner;

public class Chapter3Problem5{
  public static void main(String args []){
  
    Scanner keyboard= new Scanner(System.in);
  System.out.println("Enter an object's mass");
  double mass= keyboard.nextDouble();
  
  double weight= mass* 9.8;
  
  if (weight> 1000){
  System.out.println("Object is too heavy");
  }
  else if (weight < 10){
  System.out.println("Object is too light");
  }
  
  }




}