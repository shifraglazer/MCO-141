import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter4Problem9{
  public static void main(String args []){
    
    Scanner keyboard= new Scanner(System.in);
    DecimalFormat formatter=new DecimalFormat("0.#");
    System.out.println("How many starting organisms are there?");
    double organisms= keyboard.nextDouble();
    
    System.out.println("What is average daily population increase (as a percentage)?");
    double populationIncrease= keyboard.nextDouble();
    
    System.out.println("How many days will they multiply for?");
    double days= keyboard.nextDouble();
    
    
    double totalOrganisms=0;
    for(int i=1;i<=days;i++){
      
      totalOrganisms= (populationIncrease/100)* organisms;
      organisms+=totalOrganisms;
      System.out.println("Day "+ i + "\t"+ formatter.format(organisms)+ " organisms");
      
    }
  
  }

}