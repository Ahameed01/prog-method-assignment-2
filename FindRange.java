/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		/* 
		 * This program finds the range of 
		 * any set of numbers until the Sentinel
		 * value is reached 
		 */
		println("This program finds the minimum and");
		println("maximum values in a given set of numbers");
		
			
		println("Enter a value");
		int val = readInt();
		
		
		
		int min = 0;
		int max = 0;
		
		while (true){
			if (val == SENTINEL){
				break;
			}
			else if(val < min){
				min = val;
			}
			else if(val > max){
				max = val;
			}
		}
		println("The minimum value is " +min);
		println("The maximum value is " +max);
	}
	private static final int SENTINEL = 20;
}

