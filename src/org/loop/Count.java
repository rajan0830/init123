package org.loop;

public class Count {
//	
//	QUESTION 5:
//		-----------
//		Description: Count of even number 1 to 100
//
//		Example:
//		--------
//		Output = 50

	public static void main(String[] args) {
		int count=0;

		for (int i = 1; i<=100; i++) {
			
			if(i%2 == 0) {
				
				count++;
						
			}
		}
		
		System.out.println("Total even number between 1-100 = "+count);
		
	}

}
