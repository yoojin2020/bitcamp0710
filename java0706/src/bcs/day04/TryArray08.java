package bcs.day04;

public class TryArray08 {

	public static void main(String[] args) {
		//����2) �ζ� �߻��⸦ ������ ���� ������µ�, ���� �ߺ��� ���ڰ� ���ͼ� �����Ϸ��� �մϴ�.
		//      ���� ���ڸ� �迭�� ���� �� 
		//      �ߺ�üũ�� �ؼ� (��� ���� ���ڿ� ���� ���ڰ� �迭�� �����ϴ��� ��)
		//      �ߺ��� �ִٸ� �ش� turn�� ��ȿȭ�ϴ�(i--;) �ڵ带 �ۼ��ϼ���.
		//	 	����� �ߺ�üũ�� ������ �� �� ���������� for�� �ٱ��� �մϴ�.
		
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			//���⿡�� for���� �񱳹��� �ۼ�
			
		}//i end
		
		for(int temp:lotto)System.out.println(temp+"\t");
		
	  
	}//main end

}//class end
