import java.util.*;
import java.util.Scanner;


public class Seasons {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String month;
		month = scan.nextLine();
		month = month.toUpperCase();
		switch (month){
			case "JANUARY": case "Febuary":
				System.out.println("Month is ");
				break;
			default:
				System.out.println("Month is not valid");
		}
	}
}