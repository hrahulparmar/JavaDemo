import java.util.Scanner;

class Guesser
{
	int number;
	void guessing() {
		System.out.println("Enter Guesser number");
	Scanner sc= new Scanner(System.in);
	number=sc.nextInt();
	}
}
class Player
{
	int input1;
	int input2;
	int input3;
	void guessAttempt() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first Attempt");
		input1=sc.nextInt();
		System.out.println("Enter second Attempt");
		input2=sc.nextInt();
		System.out.println("Enter third Attempt");
		input3=sc.nextInt();
	}
}
class Umpire
{
	int guessNo;
	void compare()
	{
		Guesser gs= new Guesser();
		Player pl= new Player();
		guessNo=gs.number;
		if(guessNo==pl.input1) {
			System.out.println("Correct");
		}else if(guessNo==pl.input2) {
			System.out.println("correct");
		}else if(guessNo==pl.input3) {
			System.out.println("correct");
		}else {
			System.out.println("Incorrect");
		}
	}
}
public class GuessGame {

	public static void main(String []args) {
		Umpire up= new Umpire();
		Player pl= new Player();
		Guesser gs= new Guesser();
		gs.guessing();
		pl.guessAttempt();
		up.compare();
	}
}
