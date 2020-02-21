import java.util.Random;

public class RandomWalk {
	//**************************************
	//
	// The Method randomWalk
	// By:  Gene Rocha 
	// Date: 02/20/2020
	//
	//**************************************

	public static void main(String[] args) {
		randomWalk();
	}
	public static void randomWalk() {
		int position = 0;// Initial position o
		int max = 0;// Initial max 0
		
        Random rand  = new Random();
        
        System.out.println("position = " + position);// print the first position
        
		while(position < 3 && position > -3) {// if the max position is not 3 or -3
			
			int step = rand.nextInt(2);// get random number from 0 to 1
			
			if(step == 0) {//random number is 0 increment the position
				position++;
			}else {// random number is 1 decrement the position
				position--;
			}
			if(position > max) {// if the current position if greater than the current max.
				max = position;// current max is the new position
			}
			System.out.println("position = " + position);// print the current position
		}
		System.out.println("max position = " + max);// print the max
		
	}
}