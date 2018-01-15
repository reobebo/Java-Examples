package examples;

public class Binary {

	public static void main(String[] args) {
		int[] numbers = {67,78,4,15,47,30,99,33,65,85};
		binarySearch(numbers,0,numbers.length,30);
		binarySearch(numbers,0,numbers.length,31);
	
	}
	public static void binarySearch(int [] array, int lowerbound,
			int upperbound, int key){
		int position;
		
		position =(lowerbound + upperbound) /2;
		while((array[position] !=key) && (lowerbound<=upperbound))
		{
			if (array[position]>key)
			{
				upperbound = position -1;
			}
			else
			{
				lowerbound=position +1;
			}
			position = (lowerbound + upperbound)/2;
		}
		if (lowerbound<=upperbound)
		{
			System.out.println("The number was found in array at position: " + position);
		}
	}

}
