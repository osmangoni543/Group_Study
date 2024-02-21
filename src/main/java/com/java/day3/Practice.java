package com.java.day3;

public class Practice {

	public static void main(String[] args) {


		 int i = 20;
		   while(i>=0) {
		   System.out.println(i);
		   i = i-2; // i-=2;
		   }
		   
		   
		   System.out.println("********************************");
		   
		   int j = 0;
		   while(j<=20) {
		   System.out.println(j);
		   j = j+2; // i+=2;
		   }
		   
		   System.out.println("********************************");
		   
		   for(int k=100; k>=0; k=k-5){
			   System.out.println(k);   
			 }
		   
		   System.out.println("********************************");
		  
		   int m = 0;//At the end of 1st loop, this m value becomes 100
		   
		   
		   for (int n=100; n>=0; n--){//loop starts at next round
			   
		   m=m+n;                       // n=100, m=100
		   System.out.println(m);       
		   }
		   
		   System.out.println(m);

	}

}
