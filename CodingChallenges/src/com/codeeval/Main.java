package com.codeeval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner kb = new Scanner(System.in);
		String filename = args[0];
		System.out.println(filename);
		//String filename = "input.txt";
		try {
			File file = new File(filename);

			Scanner sc = new Scanner(file);
			int count = 0;
			while (sc.hasNext()) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int max = sc.nextInt();
				if (!(max < 21 || max > 100 || x < 1 || x > 20 || y < 1 || y > 20)) {
					for (int i = 1; i <= max; i++) {
						if (i % x == 0 && i%y==0) {
							System.out.print("FB");
						} else if (i % x == 0) {
							System.out.print("F");
						} else if (i % y == 0) {
							System.out.print("B");
						} else {
							System.out.print(i);
						}
						if(i!=max)
							System.out.print(" ");
						else System.out.println();
					}					
				
				}else{
					System.exit(0);
				}
				count++;
				if (count > 20)
					System.exit(0);
			}
			sc.close();
			System.exit(0);

		} catch (FileNotFoundException e) {
			System.out.println("Cannot read file - " + filename);
			e.printStackTrace();
		}
		
	}

}
