package com.mraduljain.leetcode;

public class PatchingArray {

	public static void main(String[] args) {
		int[] arr = {1,2,31,33};
		System.out.println("Total patches- "+minPatches(arr, 2147483647));
		int n= 2147483647;
			   	
		System.out.println(n);

	}
	 public static int minPatches(int[] nums, int n) {
	
		 int patchCount=0;
		 long currMax=0;
		 int i=0;
		 while(currMax<n){
	
				// nextSum=currMax+1;
			 
				 if(i<nums.length && nums[i]<=currMax+1){
					 currMax+=nums[i];
					 System.out.print(nums[i]+"*");
					 i++;
				 }
				 else{
					 patchCount++;
					 System.out.print(currMax+1+" ");
					 currMax=currMax+currMax+1;
					 
				 }
			
		 }
		 System.out.println();
		 return patchCount;
	}
}
