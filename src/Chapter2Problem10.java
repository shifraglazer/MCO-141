import java.util.Scanner;

public class Chapter2Problem10{
  public static void main(String [] args){
    
    Scanner keyboard= new Scanner (System.in);
    System.out.println("Enter test score #1.");
    double score1= keyboard.nextDouble();
    
    System.out.println("Enter test score #2.");
    double score2= keyboard.nextDouble();
                       
    System.out.println("Enter test score #3."); 
    double score3= keyboard.nextDouble();
 
    double average= (score1+ score2+ score3)/3;
    System.out.println("Test scores are " + score1);
    System.out.println(score2);
    System.out.println(score3);
    System.out.println("The average of your test scores is "+ average+"."); 
                                          
                                          
                                          
                                          
                                          }




}