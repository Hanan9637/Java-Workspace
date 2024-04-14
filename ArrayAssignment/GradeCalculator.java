package com.ArrayAssignment;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
//		2. Grade Calculator
//		Problem Statement:
//		You are tasked with creating a Java program to calculate the average grade of a student 
//		based on their scores in multiple subjects. The program should prompt the user to enter 
//		the number of subjects, then ask for the score of each subject. After collecting all the 
//		scores, the program should calculate and display the average grade.
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("How many subjects do you have? ");
	int subjects = input.nextInt();
	
	int scores[] = new int[subjects];

	float total = 0;
	for (int i=0; i<subjects; i++) {
		
		System.out.print("Enter the score for subject " + (i+1) + ": ");
		scores[i] = input.nextInt();
		
		total = total + scores[i];	
	}
	
	System.out.println();
	
	input.close();
	
	float avgGrade = total/subjects;
	
	System.out.print("Average grade: " + String.format("%.2f", avgGrade));

	}

}
