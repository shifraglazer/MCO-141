import java.util.Scanner;


public class Chapter4Problem18{
  public static void main(String args []){
    
    //initialize
    int random= 5;
    int guess=0;
    int i=0;
    
    Scanner keyboard= new Scanner(System.in);
    
    //to seperate first run
    boolean firstRun= true;
    
    
    do{
      //keep count
      i++;
      
      //if guess doesn't equal random number print error
      if (firstRun==false){
        if(guess<random){
          System.out.println("Too low, try again.");
        }
        else{
          System.out.println("Too high, try again.");
        }
      }
      
      //first run- command to guess number
      if(firstRun== true){
        System.out.println("Guess random number");
      }
      
      //new value for guess
      guess= keyboard.nextInt();
      
      //so will print error message next run if too high/low
      firstRun=false;
    }
    while(guess != random);
    
    //print number of guesses
    System.out.println("Number of guesses: " + i);
  }
}