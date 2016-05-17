package com.codeeval.LetterMystery;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter the number of test cases:");
		int numTests = sc.nextInt();
	sc.nextLine();
		String[] strings = new String[numTests];
	//	System.out.print("Enter the strings:");
		for(int i=0;i<numTests;i++){
			strings[i]= sc.nextLine();
		//	System.out.println();
		}
		sc.close();
		for(String str: strings){
			System.out.println(countOp(str));
		}
	}

	public static int countOp(String str){
		int count=0;
		int left=0, right = str.length()-1;
		String allChars ="abcdefghijklmnopqrstuvwxyz";
		while(right>left){
			char rightChar=str.charAt(right);
			char leftChar = str.charAt(left);
			if(! (rightChar==leftChar)){
				//System.out.println(allChars.indexOf(right)+"-"+allChars.indexOf(left));
				count+=Math.abs(rightChar-leftChar);				
			}
			right--;
			left++;
		}
		return count;
		
	}
}
