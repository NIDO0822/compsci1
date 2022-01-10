import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Choose a number between 1 and 1000");
	int text = sc.nextInt();
	Random rand = new Random();
	int rand_num1 = rand.nextInt(1000);
	if((text) == (rand_num1)){
		System.out.println("Thats the correct number!!");
	}
	else{
	System.out.println("Wrong number :(, the number was "+rand_num1+"");
	}	
	}
}
