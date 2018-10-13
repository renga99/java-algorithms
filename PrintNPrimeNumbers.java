/**
	program to print N prime numbers
	2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 
61 67 71 73 79 83 89 97

3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

*/

public class PrintNPrimeNumbers {

	public static void main(String[] args){

		int n = 100;


		for(int i = 2; i <= n; i++){

			checkNumberIsPrime(i);
		}
	}

	private static void checkNumberIsPrime(int number){

		boolean flag = false;

		for(int i=2; i < number; i++){

			if( number%i == 0 ){
				flag = false;
				break;
			}else{
				flag = true;
			}
		}

		if(flag){
			System.out.print(number+" ");
		}
	}

}