import java.math.BigInteger;

public class PrintNFactorial {


	public static void main(String[] args){

		BigInteger number = new BigInteger("4");

		printNFactorial(number);
	}

	private static void printNFactorial(BigInteger number){

		BigInteger temp = new BigInteger("1");

		for(int i = 1; i <= number.intValue(); i++ ){

			temp = temp.multiply(new BigInteger(String.valueOf(i)));
		}

		System.out.println(number.toString() +" factorial is "+ temp.toString());

	}

}