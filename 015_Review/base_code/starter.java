import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("What should we call you by?");
	String Name = sc.nextLine();
	System.out.println(""+Name+", excellent choice!");
	System.out.println("You need a title to go along with your name!");
	String Title = sc.nextLine();
	System.out.println(""+Name+", "+Title+"! Heroic!");
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
	System.out.println(""+Answer+", is not a possible answer!");
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue?(Cap sensitive)");
	Answer = sc.nextLine();
	}
	System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
	System.out.println("Strength(0-10):");
	int Strength = sc.nextInt();
	int Points = 25;
	if(Strength > 10){
	System.out.println("Invalid answer, please retry!");
	System.out.println("Strength(0-10):");
	Strength = sc.nextInt();
	}
	else if(Strength < 0){
	System.out.println("Invalid answer, please retry!");
	System.out.println("Strength(0-10):");	
	}
	Points = Points - Strength;
	System.out.print("You have:");
	System.out.print(Points);
	System.out.println(" points left!");
	System.out.println("Dexterity(0-10)");
	int Dexterity = sc.nextInt();
	if(Dexterity > 10){
	System.out.println("Invalid answer, please retry!");
	System.out.println("Dexterity(0-10)");
	Dexterity = sc.nextInt();
	}
	else if (Dexterity < 0){
	System.out.println("Invalid answer, please retry!");
	System.out.println("Dexterity(0-10)");
	Dexterity = sc.nextInt();
	}
	Points = Points - Dexterity;
	System.out.print("you have: ");
	System.out.print(Points);
	System.out.println(" points left!");
	System.out.println("Intelligence(0-10)");
	int Intelligence = sc.nextInt();
	if(Intelligence > 10){
		System.out.println("Invalid number, please retry");
		System.out.println("Intelligence(0-10)");
		Intelligence = sc.nextInt();
	}
	else if(Intelligence < 0){
		System.out.println("Invalid number, please retry");
		System.out.println("Intelligence(0-10)");
		Intelligence = sc.nextInt();
	}
	
	if(Points - Intelligence < 0){
		System.out.println("Invalid number,try using less points ("+Points+" points left)");
		System.out.println("Intelligence(0-10)");
		Intelligence = sc.nextInt();	
	}
	Points = Points - Intelligence;
	System.out.print("You have: ");
	System.out.print(Points);
	System.out.println(" points left!");
	System.out.println("Constitution (0-10)");
	int Constitution = sc.nextInt();
		if(Constitution > 10){
		System.out.println("Invalid number, please retry");
		System.out.println("Constitution(0-10)");
		Constitution = sc.nextInt();
	}
	else if(Constitution < 0){
		System.out.println("Invalid number, please retry");
		System.out.println("Constitution(0-10)");
		Constitution = sc.nextInt();
	}
	
	if(Points - Constitution < 0){
		System.out.println("Invalid number,try using less points ("+Points+" points left)");
		System.out.println("Constitution(0-10)");
		Constitution = sc.nextInt();	
	}
	Points = Points - Constitution;
	System.out.print("You have: ");
	System.out.print(Points);
	System.out.println(" left!");
	System.out.println("Charisma (0-10)");
		int Charisma = sc.nextInt();
		if(Charisma > 10){
		System.out.println("Invalid number, please retry");
		System.out.println("Charisma(0-10)");
		Charisma = sc.nextInt();
	}
	else if(Constitution < 0){
		System.out.println("Invalid number, please retry");
		System.out.println("Charisma(0-10)");
		Charisma = sc.nextInt();
	}
	
	if(Points - Charisma < 0){
		System.out.println("Invalid number,try using less points ("+Points+" points left)");
		System.out.println("Charisma(0-10)");
		Charisma = sc.nextInt();	
	}
	Points = Points - Charisma;
	System.out.println(""+Name+", "+Title+"!");
	System.out.println("An exceptional "+Answer+"!");
	System.out.println("Skills include: Strength: "+Strength+", Dexterity: "+Dexterity+", Intelligence: "+Intelligence+", Constitution: "+Constitution+", and Charisma: "+Charisma+"!");
	}
}
