import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter3Problem9{
  public static void main(String args []){
  
  Scanner keyboard= new Scanner(System.in);
  
  System.out.println("Enter weight of package");
  int weight= keyboard.nextInt();
  
  DecimalFormat formatter= new DecimalFormat("$#,##0.00");
  
//  switch(weight){
//    case( weight <= 2):
//      double shipping= 1.1* weight;
//      System.out.println("Shipping charge is " + formatter.format(shipping));
//      break;
//      
//    case(weight > 2 && weight <= 6):
//      double shipping= 2.2* weight;
//      System.out.println("Shipping charge is " + formatter.format(shipping));
//      break;
//      
//    case(weight > 6 && weight <= 10 ):
//      double shipping= 3.7* weight;
//      System.out.println("Shipping charge is " + formatter.format(shipping));
//      break;
//      
//    case(weight > 10):
//       double shipping= 3.8* weight;
//      System.out.println("Shipping charge is " + formatter.format(shipping));
//      break;
//      
//    default:
//      System.out.println("Please enter a weight value above 0.");
//  
//  }
    System.out.println("Weight\tRate per 500 Miles Shipped");
  if (weight <= 2){ 
  double shipping= 1.1;
      System.out.println(weight + "\t" + formatter.format(shipping));
    }
  else if(weight > 2 && weight <= 6) {
  double shipping= 2.2;
      System.out.println(weight + "\t" + formatter.format(shipping));
  }
  else if(weight > 6 && weight <= 10 ) {
  double shipping= 3.7;
      System.out.println(weight + "\t" + formatter.format(shipping));
  }
  else {
  double shipping= 3.8;
      System.out.println(weight + "\t" + formatter.format(shipping));
  }
  
  }





}