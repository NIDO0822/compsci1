import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int rand_num1 = rand.nextInt(10);
	System.out.println("A random number between 0 and 9, "+rand_num1+" ");
	int rand_num2 = 1 + rand.nextInt(100);
	System.out.println("A random number between 1 and 100, "+rand_num2+" ");
	double rand_num3 = 2.5 + rand.nextDouble();
	System.out.println("A random number between 2.5 and 3.5, "+rand_num3+" ");
	int rand_num4 = 14 + rand.nextInt(576);
	double rand_num5 = rand.nextDouble();
	double D = rand_num4 + rand_num5;
	System.out.println("A random Double between 14 and 589,"+D+" ");
	}
}
