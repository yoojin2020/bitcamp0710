package bcs.day03;

public class TryLoop8 {

	public static void main(String[] args) {
		//�Ʒ��� while�������� Math.random() �޼ҵ带 �̿��ؼ� 2���� �ֻ����� ������ �� 
		//������ ���� (��1, ��2)�� ���·� ����ϰ� �ֽ��ϴ�. (�� 10�� ����)
		//�ֻ����� �����ٰ� ���� ���� 5�̸� '��������'�� �����ϰ� ������ ���ߵ��� �ڵ带 �ϼ��غ�����. 
		int count = 1;
		
		while (count<=10) {
			count++;
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			
		    //�̰��� if���� �ۼ��մϴ�.
		}

	}

}
