import java.util.*;
import java.util.Scanner;


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
				System.out.println(month + " is in Summer");
				break;
			default:
				System.out.println("Month is not valid");
		}
	}
}