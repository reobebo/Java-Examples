package examples;

public class Debugging {

	public static void main(String[] args) {
		int number;
		double average, value;
		String[] daysOfTheWeek={"Sunday", "Monday", "Tuesday", "Wednesday", 
				"Thursday", "Friday", "Saturday"};
		value =3.75;
		number = (int)value;
		//average=(3+5+8)/3;
		System.out.println("The first day of the week is: "+ daysOfTheWeek[0]);
		System.out.println("The Last day of the week is: "+daysOfTheWeek[6]);
		average=(3+5+8)/3.0;
		System.out.println("Expected value is 5.33, actual value is: "+ average);
		

	}

}
