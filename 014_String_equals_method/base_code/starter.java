import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue?(Cap sensitive)");
	String Answer = sc.nextLine();
	
	if(Answer.equals("Wizard")){
		System.out.println("You are a Wizard. Cool");
	}
	else if(Answer.equals("Warrior")){
		System.out.println("You are a Warrior. Nice");
	}
	else if(Answer.equals("Rogue")){
		System.out.println("You are a Rogue. Dope");
	}
	else{
	System.out.println(""+Answer+", is not a possible answer. Rerun the program please!");	
	}
	}
}
