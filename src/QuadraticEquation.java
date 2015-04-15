import java.util.Scanner;
public class QuadraticEquation{
  public static void main(String arg []){
    
    Scanner keyboard= new Scanner(System.in);
    
    System.out.println("Enter numeric value for A");
    int a= keyboard.nextInt();
    
     System.out.println("Enter numeric value for B");
    int b= keyboard.nextInt();
    
     System.out.println("Enter numeric value for C");
    int c= keyboard.nextInt();
    
    double x1=( -b - Math.sqrt(b*b - 4 * a*c))/(2*a);
    System.out.println("x="+ x1);
    
    double x2=(-b + Math.sqrt(b*b - 4 * a*c))/(2*a);
    System.out.println("x="+ x2);
    
  
  
  }




}