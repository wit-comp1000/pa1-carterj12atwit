package comp1000_pa1;
import java.util.Scanner; //import scanner
public class PA1b {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //launch scanner
        	System.out.println("How many inches?"); // asks for inches
        	int inches = in.nextInt(); // input inches
        	int yards = inches/36; //divides total inches by 36
        	inches %= 36; //remainder is carried over to feet
        	int feet = inches/12; //divide leftover inches from yards by 12
        	inches %= 12; //remaining inches from yards and feet calculations go to inches
        	System.out.println("Yards: " + yards); //print number of yards
        	System.out.println("Feet: " + feet); // print number of inches
        	System.out.println("Inches: " + inches); // print number of inches
	}

}
