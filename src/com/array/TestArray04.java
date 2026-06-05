package com.array;

public class TestArray04 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 1, 2, 3 };
		int[] c;

		if (a.length > b.length) {
			c = new int[a.length];
		} else {
			c = new int[b.length];
		}
		for (int i = 0; i < c.length; i++) {
			if (i < b.length) {
				c[i] = a[i] + b[i];
			} else {
				c[i] = a[i];
			}
		}

		for (int n : c) {
			System.out.print(n + " ");
		}

	}

}
