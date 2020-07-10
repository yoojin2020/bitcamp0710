package bcs.day03;

public class TryLoop8a {

	public static void main(String[] args) {
		int count=1;
		
		while (count<=10) {
			count++;
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if ((num1 + num2) == 5) {
				System.out.println("게임종료");
				break;
			}
		}

	}

}
