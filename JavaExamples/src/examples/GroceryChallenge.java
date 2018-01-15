package examples;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> groceries = new ArrayList<String>();
		groceries.add("Bananas");
		groceries.add("Wheat Bread");
		groceries.add("1% Milk");
		groceries.add("Crackers");
		groceries.add("Oatmeal");
		
		System.out.println("Here is the current list: \n" 
				+ groceries.toString());
		System.out.println("Enter another item or \"quit\" to exit");;
		String newItem = in.nextLine();
		boolean found = false;
		while (newItem.equalsIgnoreCase("quit")==false)
		{
			for(int i=0;i<groceries.size();i++)
			{
				if (newItem.equalsIgnoreCase(groceries.get(i)))
				{
					System.out.println("This item is already in the list.");
					found=true;
				}
				
			}
			if(found==false)
			{
				groceries.add(newItem);
			}
			System.out.println("Enter another item or \"quit\" to exit");
			newItem=in.nextLine();
		}
		System.out.println("\nHere is the final list: \n"+
		groceries.toString());

	}

}
