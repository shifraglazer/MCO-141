import java.util.Scanner;
public class Bullseye{
  public static void main(String args []){
    
    Scanner keyboard=new Scanner(System.in);    
    
    //inititate
    int points=0;
    int totalPoints=0;
    int totalPoints2=0;
    
    //get value for first x
    double x=keyboard.nextDouble();
    double y=0;
    double distance=0;
    
    //input validation
    while(x!=-100){
      
      //calculate first player's score
      for(int j=1;j<=3;j++){

        y= keyboard.nextDouble();
        
        distance= Math.sqrt(x*x + y*y);
        
        //how many points get for shot
        if(distance<=3){
          points=100;
        }
        
        else if(distance>3 & distance<=6){
          points= 80;
        }
        
        else if(distance>6 & distance<=9){
          points= 60;
        }
        
        else if(distance>9 & distance<=12){
          points= 40;
        }
        
        else if(distance>12 & distance<=15){
          points= 20;
        }
        
        else{
          points=0;
        }

      //total points for player and next double
        totalPoints+=points;
        x=keyboard.nextDouble();
      }

      
      
      //points for player2
      for(int i=1;i<=3;i++){

        y= keyboard.nextDouble();
        
        distance= Math.sqrt(x*x + y*y);
        

        
        //points for throw
        if(distance<=3){
          points=100;
        }
        
        else if(distance>3 & distance<=6){
          points= 80;
        }
        
        else if(distance>6 & distance<=9){
          points= 60;
        }
        
        else if(distance>9 & distance<=12){
          points= 40;
        }
        
        else if(distance>12 & distance<=15){
          points= 20;
        }
        
        else{
          points=0;
        }
        
        //points for player 2 and nextDouble
        totalPoints2+=points;
        x=keyboard.nextDouble();
      }

      //print out scores
      System.out.print("SCORE: "+ totalPoints + " to " + totalPoints2 + ", ");
      
      //print who wins
      if(totalPoints>totalPoints2){
        System.out.print("PLAYER 1 WINS.");
      }
      else if(totalPoints2>totalPoints){
        System.out.print("PLAYER 2 WINS.");
      }
      else{
        System.out.print("TIE.");
      }
      
      //newline and set totalPoints to 0 so can add points for next game
      System.out.println();
      totalPoints=0;
      totalPoints2=0;
      
    }
    
    
  }
  
}