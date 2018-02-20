import java.util.*;
import java.util.Scanner;
/*
Jonathan Meredith
This program gets input from the user about what month it is.
From there the program tells them what season the month is in.
*/
	

public class Seasons {
	public static void main(String[] args) {
		
		//Set up scanner
		Scanner scan = new Scanner(System.in);
		
		//Declare Variables
		String month,
				upperCaseMonth;
		
		//Get input from the user
		System.out.println("Please enter the month:");
		month = scan.nextLine();
		scan.close();
		
		//Convert month to all uppercase to test the different cases
		upperCaseMonth = month.toUpperCase();
		
		//Check what season the month is in and display the result
		switch (upperCaseMonth){
			case "DECEMBER": case "JANUARY": case "FEBURARY":
				System.out.println(month + " is in Winter ");
				break;
			case "MARCH": case "APRIL": case "MAY":
				System.out.println(month + " is in Spring");
				break;
			case "JUNE": case "JULY": case "AUGUST":
				System.out.println(month + " is in Summer");
				break;
			case "SEPTEMBER": case "OCTOBER": case "NOVEMBER":
				System.out.println(month + " is in Fall");
				break;
			default:
				System.out.println("Month is not valid");
		}
	}
}
