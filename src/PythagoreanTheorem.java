import java.util.Scanner;

public class PythagoreanTheorem{
  public static void main(String args []){
    double a;
    double b;
    Scanner keyboard= new Scanner(System.in);
    
    System.out.println("What is the value for a?");
    a= keyboard.nextDouble();
    System.out.println("What is the value for b?");
    b= keyboard.nextDouble();
    
    
    
    double c= Math.sqrt(a * a +b * b);
    System.out.println(c);
    
    
    
  }




}