/**
	prints power of N
	example 2 power 3 is 8
*/

public class PrintPowerOfN {

	public static void main(String[] args){

		int number = 5;
		int power = 3;

		printPower(number, power);
	}

	private static void printPower(int number, int power){

		int sum = 1;

		for(int i = 1; i <= power; i++){

			sum = sum * number;
		}

		System.out.println(number +" power of "+ power + " is "+ sum);

	}
}