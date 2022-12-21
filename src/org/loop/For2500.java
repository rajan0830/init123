package org.loop;

public class For2500 {
	
//	QUESTION 4:
//		------------
//		Description: Find the sum of odd number 1 to 100
//
//		Example:
//		--------
//		Output = 2500

	public static void main(String[] args) {
		int c=0,d=0,i;
				
		for ( i = 0; i<=100; i++) {
			
			if (i%2 == 1) {
				
			d=i++;
			}
		}
		System.out.println(d);

	}
	


}
