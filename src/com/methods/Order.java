package com.methods;

import java.util.Scanner;

public class Order {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Sentence to reverse : ");
		String str = sc.nextLine();
		
		
		String[] words=str.split(" ");
		
		for(int i=0;i<words.length;i++) {
			String rev = new StringBuilder(words[i]).reverse().toString();
			words[i]=rev;
						
		}
		String result = String.join(" ", words);
		System.out.println(result);
	
		sc.close();
	}
		
		
		
	}

