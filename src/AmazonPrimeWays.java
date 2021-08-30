// Java implementation to count total
// number of ways to split a String
// to get prime numbers
import java.util.Arrays;

class AmazonPrimeWays {
	
	private static int MOD = 1000000007;
	private static boolean [] nonPrimeArray = new boolean[1000000];

	// Function to build sieve to identify prime numbers.
	public static void generatePrimeNumberSieve() {
		for(int i = 2; i * i <= 1000000; i++) {

			nonPrimeArray[0] = true;
			nonPrimeArray[1] = true;

			if (!nonPrimeArray[i]) {

				//Assign all non-prime values to true after square of a given prime number.
				for(int j = i * i; j < 1000000; j += i) {
					nonPrimeArray[j] = true;
				}
			}
		}
	}

	//Check from sieve if the number is prime or not.
	private static boolean isPrime(String number) {
		int num = Integer.valueOf(number);
		return !nonPrimeArray[num];
	}

	// Using Memoization to store already processed number string.
	private static int countPrime(String numberStr, int []memArray, int endIndex) {

		//If string with given endIndex is already evaluated, use memoized value.
		if (memArray[endIndex] != -1) {
			return memArray[endIndex];
		}

		//Initialize counter.
		int cnt = 0;

		for(int i = 1; i <= 6; i++) {

			//Count if number is prime and recursively call for remaining sub-string.
			if (endIndex - i >= 0
					&& numberStr.charAt(endIndex - i) != '0'
					&& isPrime(numberStr.substring(endIndex - i, endIndex))) {
				cnt += countPrime(numberStr, memArray, endIndex - i);
				cnt %= MOD;
			}
		}

		return memArray[endIndex] = cnt;
	}


	public static int countPrimeStrings(String inputStr) {
		//Generate prime number identification sieve/map.
		generatePrimeNumberSieve();

		int n = inputStr.length();

		//Memoization Array to store ways to split a string ending at a given index.
		int[] memArray = new int[n + 1];

		//Fill all values with -1 initially.
		Arrays.fill(memArray, -1);

		//If there is only 1 prime number, then it is also considered as 1 way of splitting.
		memArray[0] = 1;

		return countPrime(inputStr, memArray, n);
	}

	// Driver code
	public static void main(String[] args) {
		String s1 = "11373";
		System.out.print(countPrimeStrings(s1) + "\n");
	}
}

