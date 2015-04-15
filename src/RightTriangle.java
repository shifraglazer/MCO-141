import java.util.Scanner;
import java.text.DecimalFormat;

public class RightTriangle{
  public static void main(String args []){
    
    Scanner keyboard=new Scanner(System.in);
    DecimalFormat f= new DecimalFormat("##.00");
    
    System.out.println("Angle A?");
    double angleA=keyboard.nextDouble();
    
    System.out.println("Side C?");
    int sideC= keyboard.nextInt();
    
    double sideA= (Math.cos(Math.toRadians(angleA)))*sideC;
    double sideB= (Math.sin(Math.toRadians(angleA)))* sideC;
    double angleB=90-angleA;
    
    System.out.println("Side a= " + f.format(sideA));
    System.out.println("Side b= " + f.format(sideB));
    System.out.println("Angle B= " + f.format(angleB));
  }
  
}