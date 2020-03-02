	//**************************************
	//
	// The Method: isSorted
	// isSorted accepts an array of doubles as a parameter and returns true if the 
	// list is in sorted (nondecreasing) order and false otherwise. 
	//
	// By:  Gene Rocha 
	// Date: 03/01/2020
	//
	//**************************************

	public static void main(String[] args) {
		double[] list1 = {1.2,3.4,5.6,7.8,9.9};
		double[] list2 = {3.4,5.6,18.0,2.3,4.5};
		isSorted(list1);// should return true
		isSorted(list2);// should return false

	}
	public static boolean isSorted(double[] list) {
        for(int i = 0; i < list.length -1; i++) {// check every value in the array expect for the last one
             if(list[i + 1] < list[i])// if the next value is less than the previous return false
                 return false;
         }
         return true;// the array is sorted
	}
