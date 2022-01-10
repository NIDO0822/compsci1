import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String text = sc.nextLine();
		
		System.out.println("How old are you?");
		int one = sc.nextInt();
		
		System.out.println("What is your Birth Month?");
		int wun = sc.nextInt();
		
		System.out.println("What is your Birth Day?");
		int two = sc.nextInt();
		
		System.out.println("What is your Birth Year?");
		int three = sc.nextInt();
		
		System.out.println("How much is a Buck fifty");
		double number = sc.nextDouble();
		
		System.out.println("Your name is "+text+" and you were born on "+wun+","+two+","+three+".");
		System.out.println("Your are "+one+" years old!");
		System.out.println("You have $"+number+" in ur wallet.");
	}
}
