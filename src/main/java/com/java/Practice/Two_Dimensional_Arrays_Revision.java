package com.java.Practice;

public class Two_Dimensional_Arrays_Revision {

	public static void main(String[] args) {
		
//		int[][] a;
//		
//		a = new int[4][4];
//		
//		a[0][0] = 1;
//		.
//		.
//		a[3][3] = 6;
		    //00 01 02 03
//		a = {{1, 2, 3, 4},
		    //10 11 12 13
//			 {5, 6, 7, 8},
		    //20 21 22 23
//			 {9, 0, 1, 2},
		    //30 31 32 33
//			 {3, 4, 5, 6}};
		
		            //00 01 02 03
		int[][] a = {{1, 2, 3, 4},
			        //10 11 12 13
				     {5, 6, 7, 8},
			        //20 21 22 23
  			         {9, 0, 1, 2}};
		
		
		System.out.println(a[2][3]);
		System.out.println(a.length); //prints the length of row
		System.out.println(a[0].length); //prints the length of column for each row
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		
		for(int i=0;i<a.length ;i++) {     //row        memorize the whole section
			
			for(int j=0;j<a[i].length ;j++) {        //column
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
//		for(int i=0;i<a[2].length;i++) {    //If you want to print one specific row 
//		System.out.print(a[2][i] + " ");
//	}
	
	
	
		
	}
	

	}


