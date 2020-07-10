package bcs.day04;

import java.util.Arrays;

public class TryArray02a {

	public static void main(String[] args) {

		int[] lotto = { 25, 33, 45, 27, 9, 12 };

		// 배열을 관리하는 클래스 java.util.Arrays
		for (int temp : lotto) {
			System.out.print(temp + " ");
		}

		System.out.println();
		Arrays.parallelSort(lotto); // 낮은순으로 소트
		for (int temp : lotto) { 
			System.out.print(temp + " ");
		}


	}// main end

}// class end
