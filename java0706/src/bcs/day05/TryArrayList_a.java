package bcs.day05;

import java.util.ArrayList;
import java.util.Scanner;

public class TryArrayList_a {
	//ArrayList�� �迭�� ���� ������ ������ ������ �ξ� ���뼺 �ְ� Ȱ���� �� �ֽ��ϴ�. 
	//�迭�� ������ �� �迭�� ũ�⸦ ������� ������ ArrayList�� ���� ������ �迭�� �󸶵���
	//�����͸� ������ �� �ֽ��ϴ�. 
	//�����͸� �����Ϸ��� add(), �����Ϸ��� remove(index��ȣ), ���̴� size()�޼ҵ�� ���մϴ�.
	//���� ArrayList���� �׹�° ������ "four"�� �����ϰ� 
	//����� for-each������ ����غ�����. 
	public static void main(String[] args) {
		ArrayList<String> number = new ArrayList<String>();
		number.add("one");
		number.add("two");		
		number.add("three");
		number.add("four");
		
		System.out.println("������");
		for(int i=0;i<number.size();i++)
			System.out.println(number.get(i));
		
		
		number.remove(3);
		System.out.println();
		System.out.println("������");
		for(String temp:number)System.out.println(temp);
		
	}//main end

}//class end
