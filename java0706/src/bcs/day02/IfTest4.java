package bcs.day02;

public class IfTest4 {

	public static void main(String[] args) {
		// kor: �����, eng: �����, sum: �����հ�, avg: �������
		int kor = 100, eng = 59, sum = 0;
		double avg = 0.0;
		String name = "ȫ�浿";
		// ���� 1. ������ �հ� ����� ���ϴ� ���� �ϼ��Ͻÿ�.
		sum = (kor + eng);
		avg = (double) sum / 2;

		// ����4. if���� ����ؼ� ����� 70�� �̻��̸� '���հ�', 0~69���� '�����'�̶�� �ȳ� �޽�����
		// ����� ����ϼ���. (��, ������ �־ ���� 60�� �̻��̾�� �մϴ�.)
		String msg = "�ȳ����� ���⿡ �ۼ�";

//		if (avg >= 70 && kor>=60 && eng>=60 )
//			msg = "���հ�";
//		else 
//			msg = "�����";

		if (avg >= 70)
			if (kor < 60 || eng < 60)
				msg = "����";
			else
				msg = "���հ�";
		else
			msg = "�����";

		// ����3. if���� ����ؼ� ����(grade)�� ���ϼ���.
		// ����� 100~90-> A, 80~89-> B, 70~79-> C, 60~69-> D, 59~0-> F
		char grade = 'F'; // ������ F�� �ʱ�ȭ

		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else if (avg >= 60)
			grade = 'D';

		// ���� 5. switch���� ����ؼ� ����(grade)�� ���ϼ���.
		// switch(avg/10) ���� �����ؼ� 1) ���� ������Ÿ�� ������ �ذ��ϰ�, 2) switch���� �ۼ��ϼ���.
		switch ((int) avg / 10) {
		
		case 10:
		case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F';
		}

		System.out.println("�̸�=" + name);
		System.out.println("�հ�=" + sum);
		System.out.println("���=" + avg);
		System.out.println("����=" + grade);
		System.out.println("���=" + msg); // �հ�, ���հ� �ȳ� �޽��� ���

	}

}
