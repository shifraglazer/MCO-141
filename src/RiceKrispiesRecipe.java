import java.util.Scanner;

public class RiceKrispiesRecipe  {
  public static void main(String args [] ) {
    int numberOfPeople;
    Scanner keyboard= new Scanner(System.in);
    System.out.println("How many people?");
    
    numberOfPeople= keyboard.nextInt();
    
    
    int tablespoonsOfButter=3;
    int ozRegularMarshmellows=10;
    int cupsOfCereal=6;
    double servings= numberOfPeople /12.0;
   
        
    double butterNeeded= tablespoonsOfButter *servings;
    double marshmellowsNeeded = ozRegularMarshmellows *servings;
    double cerealNeeded= cupsOfCereal* servings;
 
     System.out.println ( butterNeeded+ " tablespoons butter");
 
        System.out.println (marshmellowsNeeded +" oz regular marshmellows");
          System.out.println (cerealNeeded+ " cups of cereal");
    
    
    
    
  }
}
