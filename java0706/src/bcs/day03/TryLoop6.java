package bcs.day03;

public class TryLoop6 { 
	public static void main(String[] args) {
//����)
//		1	2	3	4	5	
//		6	7	8	9	10	
//		11	12	13	14	15	
//		16	17	18	19	20	
//		21	22	23	24	25	
//		26	27	28	29	30 
        //�ǽ�) do~while������ 1���� 30���� ����ϴµ� ����ó�� 5������ ���� �ٲٷ��� �մϴ�.
		//������ ��ġ�� ���ǹ��� �־� a�� 5�� ����� �ɶ����� System.out.println()���� �����ϵ��� �ڵ带 �ϼ��ϼ���.
		int a=0;
		do {
		 a++;
		 System.out.print(a + "\t"); 
		 if(a%5==0)
			 System.out.println();
		}while(a<30);
	}//end
}//class END

