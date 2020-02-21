
public class AllDigitsOdd {
	//**************************************
	//
	// The Method allDigitsOdd returns whether every digit of a positive number is odd.
	// Return true if the number consist of entirely odd digits.
	// By:  Gene Rocha 
	// Date: 02/17/2020
	//
	//**************************************

	public static void main(String[] args) {
		allDigitsOdd(135319);// should return true
		allDigitsOdd(9145293);// should return false
		allDigitsOdd(4822116);// should return false
		allDigitsOdd(0);// should return false

	}
	public static boolean allDigitsOdd(int nums) {
		int lastDigit;// local variable for the last digit
		int evenCount = 0;// Initial event count value 0
		nums = Math.abs(nums);// change the number to a positive number
		if(nums == 0) {// check if zero and return false if true
			return false;
		}
		while(nums > 0) {
			lastDigit = nums % 10;// get the last digit of the number
			if(lastDigit % 2 == 0) {// check if the last digit of the number is even
				evenCount++;// increment the even count
			}nums = nums / 10;// divide the number by 10 to get the next digit
		}
		if(evenCount == 0) {// no odd digits
			return true;
		}else {// all odd digits
			return false;
		}
		
	}
}
