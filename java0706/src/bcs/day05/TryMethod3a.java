package bcs.day05;

public class TryMethod3a {

	public static void main(String[] args) {
		TryMethod3a my = new TryMethod3a();
		int[] a = my.lottoInput();
		my.lottoOutput(a);

	}// main end

	public int[] lottoInput() {// 리턴값
		int data[] = new int[6];
		for (int i = 0; i < 6; i++) {
			data[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++)
				if (data[i] == data[j]) {
					i--;
					break;
				}
		}
		return data;
	}// end

	public void lottoOutput(int[] b) { // 매개인자
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}// end
}// class end
