package examples;

public class Overloading {

	public static void main(String[] args) {
		System.out.println("The average of three integers is: "+ average(3,5,8));
		System.out.println("The average of three double is: " + average(4.0,6.0,18.0));

	}
	public static double average(int x, int y, int z)
	{
		return (x+y+z)/3.0;
	}
	public static double average(double x, double y, double z)
	{
		return (x+y+z)/3;
	}

}
