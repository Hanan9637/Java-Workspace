package com.ArrayAssignment;

public class MatrixAddition {
	

	public static void main(String[] args) {
		
//		. Matrix Addition
//		Consider the following assignment:
//		Problem Statement:
//		You are tasked with writing a Java method to perform addition on two matrices. Each 
//		matrix is represented as a two-dimensional array of integers. Your task is to implement a 
//		method matrixAddition that takes two matrices A and B as input and returns their sum 

		
	int a[][] = {{1,3,5}, {2,4,6}, {7,9,11}};
	int b[][] = {{12,13,14}, {21,22,23}, {31,32,33}};
	
	int c[][] = new int[3][3];
	
    for(int n=0; n<a.length; n++) {

		for(int i=0; i<a[n].length; i++) {
			
		 c[n][i] = a[n][i] + b[n][i];
		
		System.out.print(c[n][i]+ " ");
		
	}

		System.out.println();
	}

}
	
}
