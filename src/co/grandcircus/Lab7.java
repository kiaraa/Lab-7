package co.grandcircus;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		validateName(scan);
		validateEmail(scan);
		validatePhone(scan);
		validateDate(scan);
		validateHTML(scan);

	}
	
	public static boolean validateName(Scanner scan) {
		System.out.println("Please enter a valid name: ");
		String input = scan.nextLine();
		boolean nameIsValid = input.matches("[A-Z][A-z]{1,30}");
		if (nameIsValid) {
			System.out.println("Name is valid!");
			return true;
		}
		else {
			System.out.println("Sorry, name is not valid!");
			return false;
		}
	}
	
	public static boolean validateEmail(Scanner scan) {
		System.out.println("Please enter a valid email: ");
		String input = scan.nextLine();
		boolean emailIsValid = input.matches("\\w{5,30}@\\w{5,10}\\.\\w{2,3}");
		if (emailIsValid) {
			System.out.println("Email is valid!");
			return true;
		}
		else {
			System.out.println("Sorry, email is not valid!");
			return false;
		}
	}
	
	public static boolean validatePhone(Scanner scan) {
		System.out.println("Please enter a valid phone number: ");
		String input = scan.nextLine();
		if (input.matches("\\d{3}-\\d{3}-\\d{4}") || input.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) {
			System.out.println("Phone number is valid!");
			return true;
		}
		else {
			System.out.println("Sorry, phone number is not valid!");
			return false;
		}
	}

	public static boolean validateDate(Scanner scan) {
		System.out.println("Please enter a valid date(mm/dd/yyyy): ");
		String input = scan.nextLine();
		if (input.matches("\\d{2}\\/\\d{2}\\/\\d{4}")) {
			System.out.println("Date is valid!");
			return true;
		}
		else {
			System.out.println("Sorry, date is not valid!");
			return false;
		}
	}
	
	public static boolean validateHTML(Scanner scan) {
		System.out.println("Please enter a valid HTML element(<tag> </tag>): ");
		String input = scan.nextLine();
		if (input.matches("<\\w{0,5}> </\\w{0,5}>")) {
			System.out.println("HTML is valid!");
			return true;
		}
		else {
			System.out.println("Sorry, HTML is not valid!");
			return false;
		}
	}
}
