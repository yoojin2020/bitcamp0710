package bcs.day02;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		//kor: �����, eng: �����, sum: �����հ�, avg: �������
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("������� �Է��ϼ��� : ");
		int kor=stdin.nextInt();
		
		System.out.print("������� �Է��ϼ��� : ");
		int eng=stdin.nextInt();
		
		String name="ȫ�浿";
		
		int sum = 0;				
		double avg=0.0;
		
		//���� 1. ������ �հ� ����� ���ϴ� ���� �ϼ��Ͻÿ�.
		sum=(kor+eng);
		avg=(double)sum/2;
		
		//����2. if���� ����ؼ� ����� 70�� �̻��̸� '���հ�', 0~69���� '�����'�̶�� �ȳ� �޽����� 
		// ����� ����ϼ���.  
		String msg = "�ȳ����� ���⿡ �ۼ�";
		
		//if(avg>=70) msg="���հ�";
		//else msg="�����";
		
		//msg = (avg>=70) ? "���հ�" : "�����";
		
		if (avg >= 70) {
			if ( !(kor < 60) | !(eng < 60) )
			msg = "���հ�";
			else msg = "���հ�";
		}
		else
			msg = "����";
		
		System.out.println("�̸�="+name);
		System.out.println("�հ�="+sum);
		System.out.println("���="+avg);
		System.out.println("���="+msg); //�հ�, ���հ� �ȳ� �޽��� ���
		
		stdin.close();

	}

}
