package bcs.day04;

import java.util.Arrays;

public class TryArray02a {

	public static void main(String[] args) {

		int[] lotto = { 25, 33, 45, 27, 9, 12 };

		// �迭�� �����ϴ� Ŭ���� java.util.Arrays
		for (int temp : lotto) {
			System.out.print(temp + " ");
		}

		System.out.println();
		Arrays.parallelSort(lotto); // ���������� ��Ʈ
		for (int temp : lotto) { 
			System.out.print(temp + " ");
		}


	}// main end

}// class end
