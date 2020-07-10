package bcs.day03;

public class TryLoop6 { 
	public static void main(String[] args) {
//보기)
//		1	2	3	4	5	
//		6	7	8	9	10	
//		11	12	13	14	15	
//		16	17	18	19	20	
//		21	22	23	24	25	
//		26	27	28	29	30 
        //실습) do~while문으로 1에서 30까지 출력하는데 보기처럼 5개마다 줄을 바꾸려고 합니다.
		//적절한 위치에 조건문을 넣어 a가 5의 배수가 될때마다 System.out.println()으로 개행하도록 코드를 완성하세요.
		int a=0;
		do {
		 a++;
		 System.out.print(a + "\t"); 
		 if(a%5==0)
			 System.out.println();
		}while(a<30);
	}//end
}//class END

