import java.util.Scanner;

public class Reciept{
  public static void main(String args []){
  
    Scanner keyboard=new Scanner(System.in);
    
    double items []= new double [5];
    for(int i=0;i<items.length;i++){
    System.out.println("Enter an item");
    items [i]=keyboard.nextDouble();
    
    
    }
    double total=0;
    
     for(int i=0;i<items.length;i++){
    
    total+=items [i];
    
    }
     
       for(int i=1;i<items.length;i++){
    
         items [i]+=items[i-1];
    
    }
       
         for(int i=0;i<items.length;i++){
    
        System.out.println(items [i]);
    
    } 
  }
  
  


}