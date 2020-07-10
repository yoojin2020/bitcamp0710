package bcs.day04;

public class TryArray01 {

	public static void main(String[] args) {
		
		//문제1) city라는 이름의 크기 5짜리 배열을 생성하여, 
		//도시 이름으로 값을 넣어주고 (예: "서울", "도쿄", "베이징", "뉴욕", "하노이") 
		//for문과 for~each문을 각각 사용하여 배열을 출력하세요. 
		String[] arr = new String[] {"서울", "도쿄", "베이징", "뉴욕", "하노이"};
		for(int i=0 ; i<arr.length ; i++)
			System.out.println(arr[i]);
		
		System.out.println();
		
		for(String temp:arr)
			System.out.println(temp);
		
	}//main end

}//class end
