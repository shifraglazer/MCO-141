import java.util.Scanner;
public class Chapter4Problem19{
  public static void main(String args[]){
  
  Scanner keyboard=new Scanner(System.in);
  
  System.out.println("Enter positive integer no greater than 15");
  int square=keyboard.nextInt();
  
  for(int i=1;i<=square; i++){
    for(int j=1;j<=square;j++){
      System.out.print('X');
    }
    System.out.println();
  }
  
  }


}