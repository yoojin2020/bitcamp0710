package bcs.day04;

public class TryArray08a {

	public static void main(String[] args) {
		//����2) �ζ� �߻��⸦ ������ ���� ������µ�, ���� �ߺ��� ���ڰ� ���ͼ� �����Ϸ��� �մϴ�.
		//      ���� ���ڸ� �迭�� ���� �� 
		//      �ߺ�üũ�� �ؼ� (��� ���� ���ڿ� ���� ���ڰ� �迭�� �����ϴ��� ��)
		//      �ߺ��� �ִٸ� �ش� turn�� ��ȿȭ�ϴ�(i--;) �ڵ带 �ۼ��ϼ���.
		
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--; break;
				}//if end
			}//j end
		}//i end
		
		for(int temp:lotto)System.out.print(temp+"\t");
	}//main end

}//class end
