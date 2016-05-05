package com.mraduljain.leetcode;

public class DecodeWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecodeWay dw = new DecodeWay();
		System.out.println(dw.numDecodings("1200034561"));
		System.out.println(dw.numDecodings("0000012"));
	}
	public int numDecodings(String s) {
		if(s.isEmpty())
			return 0;
        int numWays=0;
        int[] ways = new int[s.length()];
       
        for(int i=0;i<s.length()-1;i++){
        	String sub = s.substring(i, i+2);
        	/*
        	if(sub.startsWith("1")){
        		numWays++;
        	}
        	else */ 
        	
        		if(!sub.startsWith("0") ){
        			
        			ways[i]++;
        			if(Integer.parseInt(sub)<=26){
        				ways[i]++;
        			}
        		}
        
        }
      //  if(!s.endsWith("0"))
        	//numWays++;
        	for(int i = 0;i<s.length();i++){
        		numWays*=ways[i];
        	}
        return numWays;
    }
}
