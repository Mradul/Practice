package com.codeeval.BinaryGap;

public class Solution {

	
	public int solution(int N){
		int count=0;//, currCount=0;
		if (N==0)
			return 0;	
		String binaryRep= Integer.toBinaryString(N);
		
		binaryRep= binaryRep.substring(binaryRep.indexOf('1'), binaryRep.lastIndexOf('1')+1);
		System.out.println(binaryRep);
		String[] sub= binaryRep.split("1");
		for(int i=0; i<sub.length;i++){
			if(sub[i].length()>count)
				count=sub[i].length();
		}
		return count;
	}
	public static void main(String[] args) {
	
		Solution so = new Solution();
		
		System.out.println(so.solution(9));
		;
		System.out.println(so.solution(529));
		;
		System.out.println(so.solution(15));
		;
		System.out.println(so.solution(1041));
		;
		System.out.println(so.solution(0));
		System.out.println(so.solution(8));
	}

}
