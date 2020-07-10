package bcs.day04;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] score = new int[6];
		
		for (int i = 0; i < 6; i++) {
			score[i] = ran.nextInt(45);
			System.out.print(score[i] + " ");
		}

	}// main end

}// class end
