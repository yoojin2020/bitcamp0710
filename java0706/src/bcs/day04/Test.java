package bcs.day04;

public class Test {

	public static void main(String[] args) {

		int[] arr = new int[6];
		
		for (int i = 0; i < 6; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
			System.out.print(arr[i] + " ");
		}

	}// main end

}// class end
