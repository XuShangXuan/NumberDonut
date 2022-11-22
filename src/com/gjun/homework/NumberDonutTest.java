package com.gjun.homework;

public class NumberDonutTest {

	public static void main(String[] args) {

		int[][] numberDonuts = buildNumberDonut(3);

		for (int[] i : numberDonuts) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	public static int[][] buildNumberDonut(int number) {

		int[][] ary = new int[number * 2 - 1][number * 2 - 1];

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {

				ary[i][j] = 3;

			}
		}

		for (int i = 1; i < ary.length - 1; i++) {
			for (int j = 1; j < ary.length - 1; j++) {

				ary[i][j] = 2;

			}
		}

		for (int i = 2; i < ary.length - 2; i++) {
			for (int j = 2; j < ary.length - 2; j++) {

				ary[i][j] = 1;

			}
		}

		return ary;
	}

}
