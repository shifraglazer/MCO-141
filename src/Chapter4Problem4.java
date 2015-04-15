import java.util.Scanner;
import java.text.DecimalFormat;
public class Chapter4Problem4{
  public static void main(String args[]){
    
    Scanner keyboard=new Scanner(System.in);
    DecimalFormat formatter= new DecimalFormat("$#,##0.00");
    
    
    System.out.println("How many days did you work for?");
    int days= keyboard.nextInt();
    
    
    double totalPay=0;
    double payRate=.01;
    
    for(int i=1;i<=days; i++){
      totalPay += payRate;
      System.out.println("Day "+ i+ "\t"+ formatter.format(payRate));
      payRate *=2;
       
    }
    System.out.println("Total pay for period is "+ formatter.format(totalPay));
  
  
  }

}