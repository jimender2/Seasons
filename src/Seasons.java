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
			case "JANUARY": case "FEBURARY": case "March":
				System.out.println(month + " is in Winter ");
				break;
			case "APRIL": case "MAY": case "JUNE":
				System.out.println(month + " is in Spring");
				break;
			case "JULY": case "AUGUST": case "SEPTEMBER":
				System.out.println(month + " is in Summer");
				break;
			case "OCTOBER": case "NOVEMBER": case "DECEMBER":
				System.out.println(month + " is in Fall");
			default:
				System.out.println("Month is not valid");
		}
	}
}
