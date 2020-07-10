package bcs.day04;

public class TryArray07a {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			System.out.print(lotto[i]+"\t");
		}
		
	}//main end

}//class end
