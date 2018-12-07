import java.util.ArrayList;
public class Tasks{
	public static void main (String[]args){
//Test 1
		Die a = new Die();
		Die b = new Die();

		int roll=0;
		System.out.println("Test 1");
		while (a.getValue() + b.getValue() > 2){
			roll++;
			a.roll();
			b.roll();
			System.out.println("Roll: "+roll);
			System.out.println("Dice 1: "+a);
			System.out.println("Dice 2: "+b);
			System.out.println();
		}

		System.out.println("It took "+roll+" tries to get a Snake Eye");
//Test 2
		System.out.println("\n");
		System.out.println("Test 2");
		DiceHolder test = new DiceHolder();
		int h = 1;
		do{
			System.out.println(test);
			int n = (int)(Math.random() * 17) + 4;
			Die die = new Die(n);
			h = test.addDie(die);

		}while(h == 1);
	test.shake();
	System.out.println(test);
	}
}

