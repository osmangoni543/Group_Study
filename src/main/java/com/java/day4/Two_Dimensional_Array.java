package com.java.day4;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		            //00 01 02 03
		int[][] a = {{1, 2, 3, 4}, 
				    //10 11 12 13
				     {5, 6, 7, 8}, 
				    //20 21 22 23
				     {9, 8, 7, 6}, 
				    //30 31 32 33
				     {5, 4, 3, 2}
				     };
		
		System.out.println(a.length);
		System.out.println(a[1].length);
		
		                                              
		for(int i =0; i<a.length; i++) {             //Memorize
			
		for(int j =0; j<a[i].length ; j++) {           
			System.out.print(a[i][j] + " ");      
		}	
		System.out.println();
		}

	}

}
