import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter an Integer:");
		int first = sc.nextInt();
		System.out.println("Please enter another Integer:");
		int second = sc.nextInt();
		System.out.println("Please enter the last Integer:");
		int third = sc.nextInt();
		if((first > second) && (first > third)) {
			System.out.println(""+first+" is the biggest Integer");
		}
		if((second > first) && (second > third)) {
			System.out.println(""+second+" is the biggest Integer");
		if((third > second) && (third > first)) {
			System.out.println(""+third+" is the biggest Integer");
		}
		}
			if((first < second) && (first < third)) {
			System.out.println(""+first+" is the smallest Integer");
		}
		if((second < first) && (second < third)) {
			System.out.println(""+second+" is the smallest Integer");
		if((third < second) && (third < first)) {
			System.out.println(""+third+" is the smallest Integer");
		}
		}
	}
}
