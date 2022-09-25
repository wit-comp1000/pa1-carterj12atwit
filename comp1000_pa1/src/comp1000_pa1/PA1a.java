package comp1000_pa1;
import java.util.Scanner; //using scanner tool for detecting user input
public class PA1a {
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //launching scanner in the program
		System.out.println("How many yards?"); //asks for yards
		int yards = in.nextInt(); //input of yards
		System.out.println("How many feet?"); //asks for feet
		int feet = in.nextInt(); //input of feet
		System.out.println("How many inches?"); //asks for inches
		int inches = in.nextInt(); //input of inches
		int sumofall = ((yards*36) + (feet*12) + inches); //equation for conversion
		System.out.println("The total number of inches is " + sumofall); //gives final answer
	}
}
