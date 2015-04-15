
public class Chapter5Problem5{
  
  public static double fallingDistance(int time){
  double distance=(.5*9.8)* time*time;
  return distance;
  
  }
  public static void main(String args []){
  
    for(int i=1;i<=10;i++){
      int seconds=i;
  double distance=fallingDistance(seconds);
  System.out.println(distance);
    }
  
  }



}