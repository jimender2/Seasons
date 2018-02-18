import java.util.*;
import java.util.Scanner;


public class Seasons {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String month;
		month = scan.nextLine();
		scan.close();
		month = month.toUpperCase();
		
		String firstLetter = month.char(0).toUpperCase();
	    String restLetters = data.substring(1).toLowerCase();
	      return firstLetter + restLetters;
	      
	      
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