package com.gjun.homework;

public class NumberDonutVersion2 {

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

		for (int ctrlBoundary = 0, ans = number; ctrlBoundary < number; ctrlBoundary++, ans--) {
			for (int i = 0 + ctrlBoundary; i < ary.length - ctrlBoundary; i++) {
				for (int j = 0 + ctrlBoundary; j < ary.length - ctrlBoundary; j++) {

					ary[i][j] = ans;

				}
			}
		}

		return ary;

	}

}
