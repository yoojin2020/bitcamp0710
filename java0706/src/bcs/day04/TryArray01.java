package bcs.day04;

public class TryArray01 {

	public static void main(String[] args) {
		
		//����1) city��� �̸��� ũ�� 5¥�� �迭�� �����Ͽ�, 
		//���� �̸����� ���� �־��ְ� (��: "����", "����", "����¡", "����", "�ϳ���") 
		//for���� for~each���� ���� ����Ͽ� �迭�� ����ϼ���. 
		String[] arr = new String[] {"����", "����", "����¡", "����", "�ϳ���"};
		for(int i=0 ; i<arr.length ; i++)
			System.out.println(arr[i]);
		
		System.out.println();
		
		for(String temp:arr)
			System.out.println(temp);
		
	}//main end

}//class end
