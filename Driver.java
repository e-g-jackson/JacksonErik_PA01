/**
 * Description:
 * This program will calculate compound interest with the compound interest formula, based on user inputs.
 * 
 * Inputs: 
 * 		Principal Amount(dollars)
 * 		Rate (percentage)
 * 		Time (years)
 * 
 * Outputs:
 * 		Future Value (dollars)
 * 
 * @author 	Erik Jackson
 * @contact erik.jackson@my.century.edu
 * @since	09/08/2024
 * 
 * Institution: Century College
 * Professor: Mathew Nyamagwa
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Driver{
	public static void main(String[] args) {
		// Declare variables:
		double interest; 						// interest rate (in percentage)
		double futureValue;						// the value after the interest rate over time 
		double principalValue;					// the principal value
		int timesCompounded = 4;				// compounds 4 times per year
		int years;								// time in years
		
		Scanner scnr = new Scanner(System.in);
		
		//INPUT
		// 
		System.out.println("| ========== INPUT ============ |\n");
		System.out.println("This program calculates Compound Interest. \nPlease input the following information:");
		
		//Get user inputs
		System.out.print("Amount to deposit: $");
		principalValue = scnr.nextDouble();		// assigns the value of the principal, based on user input
		System.out.print("Annual interest rate (in percentage): ");
		interest = scnr.nextDouble(); 			// assigns the interest rate, based on user input
		interest /= 100;						// translates the interest rate into a percentage.
		System.out.print("Time in years: ");
		years = scnr.nextInt();					// assigns how many years the program will calculate for, based on user input.
		
		//COMPUTATION
		//Calculate the future value.
		futureValue = principalValue * Math.pow((1 + (interest / timesCompounded)), (timesCompounded * years));
		
		//OUTPUT
		// Format and output the results of the calculation.
		DecimalFormat moneyFormat = new DecimalFormat("###,###,###.00");
		
		System.out.printf("\n| ========== OUTPUT ============ |\n");
		System.out.printf("Principal Amount: $ %14s \n", moneyFormat.format(principalValue));
		System.out.printf("Interest Rate: %18.1f%s \n", (interest * 100), "%");
		System.out.printf("Time in Years: %19d \n", years);
		System.out.printf("Future Value: $%19s \n", moneyFormat.format(futureValue));
	}
}
