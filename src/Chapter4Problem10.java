import java.util.Scanner;

public class Chapter4Problem10{
  public static void main(String args[]){
  
    Scanner keyboard=new Scanner(System.in);

    
//    System.out.println("Enter a series of integers (enter -99 to signal the end)");
//    
////    //boolean so can seperate first run
//    boolean firstRun=true;
//   
//    //initiate variables
//    int i=1;
//    int a=0;
//    int highest=a;
//    int lowest=a;
//    
//    //do-while more efficient because dont need to repeat a=keyboard.nextInt()
//    
//    do{
//      //for every run except for first
//      if (firstRun==false){
//      if(a<lowest){
//        lowest=a;
//      }
//      if(a>highest){
//        highest=a;
//      } 
//      }
//      
//      //next value
//      a=keyboard.nextInt();
//      
//      //first run will set lowest and highest to a
//      
//      if(firstRun==true){
//        lowest=a;
//        highest=a;
//      }
//      //set firstRun to false so doesnt reset the highest/lowest
//      firstRun=false;
//      i++;
//      
//    }
//    while(a!= -99);
    
    System.out.println("Enter a series of integers (enter -99 to signal the end)");
    int a= keyboard.nextInt();
    int i=1;
    int highest=a;
    int lowest=a;
    
    while(a!= -99){
      if(a<lowest){
        lowest=a;
      }
      if(a>highest){
        highest=a;
      } 
      a=keyboard.nextInt();
      i++;
      
    }
    
    System.out.println("Highest number is "+ highest);  
    System.out.println("Lowest number is "+ lowest); 
  }
  
  
}