import java.util.Scanner;
public class IsPrime{
  public static void main(String args []){
  
  Scanner keyboard= new Scanner(System.in);
  
  System.out.println("Enter number.");
  int number= keyboard.nextInt();
  
  boolean isPrime=true;
  for(int i=2;i< number/2;i++){
    if(number% i ==0){
      isPrime=false;
      break;
    }
  }
  if (isPrime){
    System.out.println("Number is prime");
  }
    else{
    System.out.println("not prime");
    }
 
//     int i=2;
//  boolean isPrime=true;
//  while(i< number/2){
//    if(number% i ==0){
//      isPrime=false;
//      break;
//    }
//     i++;
//  }
//    if (isPrime){
//   System.out.println("Number is prime");
//    }
//    else{
//    System.out.println("not prime");
//    }
  }



}