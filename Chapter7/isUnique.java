  //**************************************
	//
	// The Method: isUnique
	// isUnique takes an array of integers as a parameter and that returns a boolean value 
	// indicating whether or not the values in the array are unique (true for yes, false for no).
	// The values in the list are considered unique if there is no pair of values that are equal. 
	//
	// By:  Gene Rocha 
	// Date: 03/01/2020
	//
	//**************************************

	public static void main(String[] args) {
		int [] list = {4,7,3,7,8,8,3};// should return false
		//int [] list = {2,5,7,22,88,-56,21};// should return true
		isUnique(list); 

	}
	public static boolean isUnique(int[] list) {
		for(int i = 0; i < list.length;i++) {// outer for loop
			for(int j = i + 1; j < list.length; j++) {// inner for loop. Start with the second element in the outer loop
				if(list[i] == list[j]) {// the current value matches the next value 
					return false;// is not unique
				}
			}
		}
		return true;
	}
