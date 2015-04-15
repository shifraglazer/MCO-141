import java.util.Scanner;

public class Chapter4Problem17{
  public static void main(String args []){
    
    //initialize
    int random= 5;
    int guess=0;
    
    Scanner keyboard= new Scanner(System.in);
    
    //to seperate first run
    boolean firstRun= true;
    
    
    do{
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
      firstRun=false;
    }
    while(guess != random);
  }
}