package com.java.day4;

public class Revision {

	public static void main(String[] args) {
		
		String[] arr = {"Rebecca", "Daniel", "Marium", "Dylan"};
		
		//System.out.println(arr.length); //index = length - 1
		
		//System.out.println(arr[3]);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		                       //00        01        02        03
		String[][] arr2 =  {{"Rebecca", "Daniel", "Marium", "Dylan"},
				               //10        11        12        13
							{"Rebecca1", "Daniel1", "Marium1", "Dylan1"},
							   //20        21        22        23
							{"Rebecca2", "Daniel2", "Marium2", "Dylan2"}};
		
		System.out.println(arr2[2][3]);
		System.out.println(arr2.length); //row
		System.out.println(arr2[0].length); //column
		
		for(int i = 0; i<arr2.length; i++) {
			for(int j =0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
