package com.java.day4;

public class One_Dimensional_Arrays {

	public static void main(String[] args) {
		        
		//int[] a = {1,2,3,4,5};
		
		int[] a;
		
		a = new int[5];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
                  //0,1, 2, 3, 4, 5, 6, 7, 8, 9
		int[] b = {10,20,30,40,50,60,70,80,90,100}; //length=10
		
		System.out.println(b.length); //printing length
		
		System.out.println(b[5]);   //printing one element by index value
		
		for(int i =0; i<=b.length-1;i++) { //printing all elements in an Array
			System.out.print(b[i]+ " ");
		}

	}

}
