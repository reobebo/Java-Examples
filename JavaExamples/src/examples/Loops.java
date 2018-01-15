package examples;

public class Loops {

	public static void main(String[] args) {
		System.out.println("Results of do/while loop: ");
		int count =0;
		do{
			System.out.println("Hello World");
			count++;
		} while (count < 3);
		
		System.out.println("Results of while loop");
		count=0;
		while(count<3){
			System.out.println("Hello World");
			count++;
		}
		System.out.println("Results of for loop: ");
		for(int i=0; i<3; i++)
		{
			System.out.println("Hello World");
			count++;
		}
	}

}
