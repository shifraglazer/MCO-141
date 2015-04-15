import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter4Problem7{
  public static void main(String args []){
  
    Scanner keyboard=new Scanner(System.in);
    DecimalFormat formatter=new DecimalFormat("0.##%");
    
  System.out.println("How many floors are there in the hotel?");
  int floors= keyboard.nextInt();
  int rooms=0;
 int roomsOccupied=0;
 
  for(int i=1;i<=floors;i++){
  System.out.println("How many rooms are on floor " + i + "?");
  rooms+= keyboard.nextInt();
  
  System.out.println("How many rooms are occupied?");
  roomsOccupied+= keyboard.nextInt();
  }
  
  double occupancyRate=roomsOccupied/(double)rooms;
  int roomsVacant= rooms-roomsOccupied;
  System.out.println(rooms +" rooms in hotel\n" + roomsOccupied+ " rooms occupied\n"+ roomsVacant+ " rooms vacant\n" + formatter.format(occupancyRate)+" is hotel's occupancy rate");
  }

}