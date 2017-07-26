package fizzypackage;

public class FizzBuzz {

	// this program displays numbers between 1 and 100
	// if it's a multiple of 3, display 'Fizz' instead of the number
	// if it's a multiple of 5, display 'Buzz' instead of the number
	// if it's a multiple of 3 and 5, display 'FizzBuzz' instead of the number
	public static void main(String[] args) {

		System.out.println("Prepare for a FizzBuzz bonanza!");
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) { // multiple of 3 and 5
				System.out.println("FizzBuzz");
			}
			else if(i % 3 == 0) { // multiple of 3
				System.out.println("Fizz");
			}
			else if(i % 5 == 0) { // multiple of 5
				System.out.println("Buzz");
			}
			else // not a multiple of 3 or 5
				System.out.println(i);
		}
			
	} // main

}
