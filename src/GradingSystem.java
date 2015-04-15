import java.util.Scanner;

public class GradingSystem {
  public static void main(String [] args){
   
    Scanner keyboard= new Scanner(System.in);
    
    System.out.println("Enter score 1");
      int score1= keyboard.nextInt();
      
      System.out.println("Enter score 2");
      int score2= keyboard.nextInt();
      
      System.out.println("Enter score 3");
      int score3= keyboard.nextInt();
      
      double average= ((score1+score2+score3)/3)*.5;
        
        System.out.println("Enter final grade");
      double finalTest= keyboard.nextInt();
      finalTest= finalTest*.25;
      
      System.out.println("Enter attendence percentage");
      double attendence= keyboard.nextInt();
      attendence= attendence*.1;
      
      System.out.println("Enter homework grade");
      double homework= keyboard.nextInt();
      homework= homework*.15;
      
      double score= average + finalTest + attendence + homework;
      
      if (0<= score && score <= 64){
        System.out.println("F");
      } 
      else if (65<= score && score <= 70){
        System.out.println("D");
      }
      else if (71<= score && score <= 80){
        System.out.println("C");
      }
      else if (81<= score && score <= 90){
        System.out.println("B");
      }  
      
      else {
        System.out.println("A");
      }
     
      
      
  }



}