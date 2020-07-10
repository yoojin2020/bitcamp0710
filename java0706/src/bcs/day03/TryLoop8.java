package bcs.day03;

public class TryLoop8 {

	public static void main(String[] args) {
		//아래의 while문에서는 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 
		//나오는 눈을 (눈1, 눈2)의 형태로 출력하고 있습니다. (총 10번 던짐)
		//주사위를 던지다가 눈의 합이 5이면 '게임종료'를 선언하고 실행을 멈추도록 코드를 완성해보세요. 
		int count = 1;
		
		while (count<=10) {
			count++;
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			
		    //이곳에 if문을 작성합니다.
		}

	}

}
