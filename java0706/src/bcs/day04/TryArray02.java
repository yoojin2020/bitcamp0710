package bcs.day04;

import java.util.Arrays;

public class TryArray02 {

	public static void main(String[] args) {
		
		//����2) lotto��� �̸��� ������ �迭(ũ��=6)�� �����Ͽ� 
		//for~each������ ���� ����ϰ�,
		//java.util.Arrays Ŭ������ parallelSort��� �޼ҵ带 Ȱ���Ͽ�
		//�迭�� ������ �� �Ŀ� �ٽ� for~each������ ���� ����Ͽ� �������� �����ĸ� ���� ������.
		//��: 25 33 45 27 9 12 (������) 
		//    9 12 25 27 33 45 (������)
		int[] lotto = new int[] {25, 33, 45, 27, 9, 12};
		for(int temp:lotto)
			System.out.print(temp +" ");
		
		System.out.println();
		Arrays.parallelSort(lotto);
		for(int temp:lotto)
		System.out.print(temp +" ");
		
	}//main end

}//class end
