package examples;
import java.util.Scanner;
import java.util.ArrayList;
public class RealEstateMLS {

	public static void main(String[] args) {
		ArrayList<Property> mls = new ArrayList<Property>();
		Property p1 = new Property(10000, "Land", 3.5);
		mls.add(p1);
		p1 = new Property(230000,"Estate", 2.0,2,3);
		mls.add(p1);
		System.out.println(mls.toString());
		mls.remove(1);
		System.out.println("After "+mls.toString());
	}

}
