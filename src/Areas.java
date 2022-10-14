//ask the user for the length
//ask the user for width
//statement pops up
//if user wants to try again then y then keeps going
//if no stop

import java.util.Scanner;

public class Areas {

	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the length of Rectangle:");
	double length = scanner.nextDouble();
	System.out.println("Enter the width of Rectangle:");
	double width = scanner.nextDouble();
	 //Area = length*width;
	double area = length*width;
	System.out.println("Area of Rectangle is:"+area);
		}
	
	}
