/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author Rakip Bebo
 */
public class TravelCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	double distance, mpg, pricePerGallon, totalCost;
    	String vehicleType;
    	Scanner in = new Scanner(System.in); 
    	System.out.println("Enter the total distance in miles: ");
    	distance=in.nextDouble();
    	System.out.println("Enter the mpg for the vehicle: ");
    	mpg=in.nextDouble();
    	System.out.println("Enter the price of one gallon of gas: ");
    	pricePerGallon = in.nextDouble();
    	System.out.println("Please enter vehicle type");
    	vehicleType=in.next();
    	totalCost=(distance/mpg)*pricePerGallon;
    	System.out.printf("The trip is going to cost $%5.2f aince you are driving a "+vehicleType, totalCost);
    	System.out.println();
    }
 
}
