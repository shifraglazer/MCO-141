import java.util.Scanner;
public class Chapter4Problem1{
  public static void main(String args[]){
    
    Scanner keyboard= new Scanner(System.in);
  System.out.println("Enter positive nonzero integer");
  int integer=keyboard.nextInt();
  int i=1;
  int total=0;
  
  while(i<= integer){
    total= total+i;
  i++;
  }

  System.out.println(total);
  
  
  
  
  }




}