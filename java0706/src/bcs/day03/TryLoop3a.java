package bcs.day03;

public class TryLoop3a {

	public static void main(String[] args) {
		int num = 0, tot = 0;
		do {
			num = num + 1;
			System.out.print(num + "  ");
			tot = tot + num;
		} while (num < 10);

		System.out.print("tot=" + tot);

	}// main end

}// class end
