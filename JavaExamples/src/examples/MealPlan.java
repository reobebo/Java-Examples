package examples;
import java.util.Arrays;
import java.util.Scanner;
public class MealPlan {

	public static void main(String[] args) {
		int numWeeks=getTotalMealWeeks();
		double[] dailyMealCost = new double[7];
		System.out.println("Before calling the method: "
				+ Arrays.toString(dailyMealCost));
		getDailyMealCost(dailyMealCost);
		System.out.println("After calling the method: "
				+ Arrays.toString(dailyMealCost));
		
		double totalCost=computeMealPlanCost(numWeeks, dailyMealCost);
		printTotalMealPlanCost(totalCost);
		
	}
	public static int getTotalMealWeeks()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many weeks are in your semster? ");
		int totalWeeks=in.nextInt();
		return totalWeeks;
	}
	public static void getDailyMealCost(double[] dailyCost)
	{
	Scanner in = new Scanner(System.in);
	
	for(int i =0; i < dailyCost.length; i++)
	{
		System.out.println("Enter the estimated cost for day: " + (i+1));
		dailyCost[i]=in.nextDouble();
	}
	}
	public static double computeMealPlanCost(int numWeeks, double[] dailyCost)
	{
		double totalCost = 0, weeklyCost=0;
		for(int i=0;i<dailyCost.length; i++)
		{
			weeklyCost+=dailyCost[i];
		}
		totalCost=weeklyCost*numWeeks;
		return totalCost;
		
	}
	public static void printTotalMealPlanCost(double total)
	{
		System.out.printf("Your estimated total meal plan cost for the "
				+ "semester is $%5.2f", total);
		System.out.println();
	}
	

}
