package bcs.day04;

import java.util.Arrays;

public class TryArray02 {

	public static void main(String[] args) {
		
		//문제2) lotto라는 이름의 정수형 배열(크기=6)을 생성하여 
		//for~each문으로 값을 출력하고,
		//java.util.Arrays 클래스의 parallelSort라는 메소드를 활용하여
		//배열을 정렬해 본 후에 다시 for~each문으로 값을 출력하여 정렬전과 정렬후를 비교해 보세요.
		//예: 25 33 45 27 9 12 (정렬전) 
		//    9 12 25 27 33 45 (정렬후)
		int[] lotto = new int[] {25, 33, 45, 27, 9, 12};
		for(int temp:lotto)
			System.out.print(temp +" ");
		
		System.out.println();
		Arrays.parallelSort(lotto);
		for(int temp:lotto)
		System.out.print(temp +" ");
		
	}//main end

}//class end
