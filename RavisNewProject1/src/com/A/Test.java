package com.A;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int count = 0;
	for(int i=num;i!=0;i/=10) {
		count++;
	}
	System.out.println(count);
}
}
