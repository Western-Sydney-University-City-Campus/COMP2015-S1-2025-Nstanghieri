package calorieWatcher;
import java.util.Scanner;
public class CalorieWatcher {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        // Prompt the user for the number of cookies eaten
	        System.out.print("Enter the number of cookies eaten: ");
	        int numberOfCookies = input.nextInt();

	        double servingsConsumed = (numberOfCookies / 40.0) * 10;

	        double totalCalories = servingsConsumed * 300;

	        System.out.println("You consumed " + (int)totalCalories + " calories when you ate " + numberOfCookies + " cookies.");

	        input.close();
	    }
	}