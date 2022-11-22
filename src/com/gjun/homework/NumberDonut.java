package com.gjun.homework;

public class NumberDonut {

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

		for (int k = number - 1; k >= 0; k--) {
			for (int i = 0; i < ary.length; i++) {
				for (int j = 0; j < ary.length; j++) {
					if ((i <= number + k - 1 && i >= number - k - 1) && (j <= number + k - 1 && j >= number - k - 1)) {
						ary[i][j] = k + 1;
					}
				}

			}
		}

		return ary;
	}

}
