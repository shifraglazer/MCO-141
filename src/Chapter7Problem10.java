public class Chapter7Problem10{
  
  public static int getTotal(int array[]){
    int total=0;
    for(int i=0;i<array.length;i++){
      total+=array [i];
    }
    return total;
  }
  public static double getAverage(int array[]){
    int total=0;
    for(int i=0;i<array.length;i++){
      total+=array [i];
    }
    double average=total/(double)(array.length);
    return average;
  }
  public static int getHighest(int array[]){
    int highest=array[0];
  for(int i=0;i<array.length;i++){
    if(array[i]>highest){
    highest=array[i];
    }
    }
  return highest;
  }
    public static int getLowest(int array[]){
    int lowest=array[0];
  for(int i=0;i<array.length;i++){
    if(array[i]<lowest){
    lowest=array[i];
    }
    }
  return lowest;
  } 
  public static void main(String args []){
    
    int array[]= new int [5];
    array[0]=57;
    array[1]=101;
    array[2]=18;
    array[3]=-903;
    array[4]=2701;
    int total=getTotal(array);
    double average=getAverage(array);
    int highest=getHighest(array);
    int lowest=getLowest(array);
    
    System.out.println("Total is "+total);
    System.out.println("Average is "+average);
    System.out.println("Highest is "+highest);
    System.out.println("Lowest is "+lowest);
  }

}