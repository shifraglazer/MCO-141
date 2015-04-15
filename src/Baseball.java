public class Baseball{
  public static void main(String args []){
  double x=0;
  double y=0;
    for(int i=0; i<=10; i++){
     x= Math.cos(Math.toRadians(30)) * 80 * i;
     y= Math.sin(Math.toRadians(30)) * 80 * i -9.8 * .5 * i * i;
    
     System.out.println();
     System.out.println(x + " \t\t"+ y);
    }
  
  
  }



}