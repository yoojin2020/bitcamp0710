package bcs.day03;

public class TryLoop3 {

	public static void main(String[] args) {
		//�ǽ�)num=����, tot=�հ��� ���� ��, 
		//num�� �ϳ��� �������Ѽ� 1���� 10������ ���� do~while(num<10)�� �Ἥ ���ϼ���.
		//��µ� ���: 1  2  3  4  5  6  7  8  9  10  tot=55

		System.out.println("do~while(���ǹ�)���� �ǽ�");	
		int num = 0, tot = 0;
		//do{ ... }while(num<10);
		do {
			num = num + 1;
			System.out.print(num + "  ");
			tot = tot + num;
		} while(num<10);
		

		System.out.print("tot=" + tot);

	}// main end

}// class end
