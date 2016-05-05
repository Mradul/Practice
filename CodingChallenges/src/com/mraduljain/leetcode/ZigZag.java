/**
 * 
 */
package com.mraduljain.leetcode;

/**
 * @author mradul.jain
 *
 */
public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigZag zz = new ZigZag() ;
		System.out.println(zz.convert("MradulJain", 4));
		System.out.println(zz.convert("MradulJain", 3));
	}
    public String convert(String s, int numRows) {
        String [] sb = new String[numRows];
        String result="";
        int counter=0;
        for(int i =0;i<numRows;i++){
    		sb[i]= "";
    		
    	}
        while(counter<s.length()){
        	for(int i =0;i<numRows && counter<s.length();i++){
        		sb[i]+=s.charAt(counter);
        		counter++;
        	}
        	for(int j =numRows-2;j>0 && counter<s.length();j--){
        		sb[j]+=s.charAt(counter);
        		counter++;
        	}
        }
        for(int i =0;i<numRows;i++){
    		result+=sb[i].toString();
    		
    	}
        return result;
    }
}
