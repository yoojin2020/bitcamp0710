package bcs.day04;

public class TryArray08 {

	public static void main(String[] args) {
		//문제2) 로또 발생기를 다음과 같이 만들었는데, 가끔 중복된 숫자가 나와서 수정하려고 합니다.
		//      랜덤 숫자를 배열에 넣은 후 
		//      중복체크를 해서 (방금 나온 숫자와 같은 숫자가 배열에 존재하는지 비교)
		//      중복이 있다면 해당 turn을 무효화하는(i--;) 코드를 작성하세요.
		//	 	출력은 중복체크가 끝나고 난 후 최종적으로 for문 바깥에 합니다.
		
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			//여기에서 for문과 비교문을 작성
			
		}//i end
		
		for(int temp:lotto)System.out.println(temp+"\t");
		
	  
	}//main end

}//class end
