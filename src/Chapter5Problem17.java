import java.util.Random;
import java.util.Scanner;

public class Chapter5Problem17{
  
  public static void main(String args []){
    String user;
    String computer;
    do{
    computer=random();
    user=userTurn();
    
    System.out.println("The computer picked " +computer);
    
    winner(computer, user);
    
    }
    while(user.equalsIgnoreCase(computer));
    
  }
  public static String random(){
    
    Random number= new Random();
    int turn=number.nextInt(3);
    String computer;
    if(turn==1){
      computer="Rock";
    }
    
    else if(turn==2){
      computer="Paper";
    }
    
    else{
      computer="Scissors";
    }
    return computer;
  }
  
  public static String userTurn(){
    Scanner keyboard=new Scanner(System.in);
    
    System.out.println("Your turn: choose rock, paper or scissors");
    String user=keyboard.nextLine();
    return user;
  }
  
  public static void winner(String computer,String user){
    
    
    if(computer.equals("Rock") && user.equalsIgnoreCase("Scissors")){
      System.out.println("Computer wins.");
    }
    else if(user.equalsIgnoreCase("Rock") && computer.equals("Scissors")){
      System.out.println("You win!");
    }
    else if(computer.equals("Scissors") && user.equalsIgnoreCase("Paper")){
      System.out.println("Computer wins.");
    }
    else if(user.equalsIgnoreCase("Scissors") && computer.equals("Paper")){
      System.out.println("You win!");
    }
    else if(computer.equals("Paper") && user.equalsIgnoreCase("Rock")){
      System.out.println("Computer wins.");
    }
    else if(user.equalsIgnoreCase("Paper") && computer.equals("Rock")){
      System.out.println("You win!");
    }
    else if(user.equalsIgnoreCase(computer)){
      System.out.println("Tie.Play again!");
    }
    
    
  }
}