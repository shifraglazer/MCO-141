import java.util.Scanner;
import java.text.DecimalFormat;
public class Chapter4Problem16{
  public static void main(String args[]){
  
    
    //find out budget
    Scanner keyboard=new Scanner(System.in);
    DecimalFormat dollar= new DecimalFormat("$#,##0.00");
    System.out.println("What is your budget?");
    double budget= keyboard.nextDouble();

    double expense=0;
    double totalExpense=0;
    int i=0;
    
    System.out.println("Enter expenses and end with 0");
    
    //add up expenses
    do{
      totalExpense+=expense;
      expense=keyboard.nextDouble();
       i++;
    }
    while(expense!=0);
    
    //print out budget
    double monthBudget=0;
    if(budget>= totalExpense){
      monthBudget= budget-totalExpense;
      System.out.println("Under budget by: " + dollar.format(monthBudget));
    }
    else if(totalExpense> budget){
      monthBudget= totalExpense-budget;
      System.out.println("Over budget by: " + dollar.format(monthBudget));
    }
  
  }


}