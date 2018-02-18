import java.util.*;
import java.util.Scanner;
/*
Jonathan Meredith
This program does something that I really dont remember.
*/
	

public class Seasons {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String month;
		month = scan.nextLine();
		scan.close();
		month = month.toUpperCase();
		switch (month){
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
			default:
				System.out.println("Month is not valid");
		}
	}
}
