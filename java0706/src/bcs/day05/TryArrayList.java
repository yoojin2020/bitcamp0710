package bcs.day05;

import java.util.ArrayList;
import java.util.Scanner;

public class TryArrayList {
	//ArrayList는 배열과 같은 구조를 가지고 있지만 훨씬 융통성 있게 활용할 수 있습니다. 
	//배열은 생성할 때 배열의 크기를 정해줘야 하지만 ArrayList는 변경 가능한 배열로 얼마든지
	//데이터를 저장할 수 있습니다. 
	//데이터를 저장하려면 add(), 삭제하려면 remove(index번호), 길이는 size()메소드로 구합니다.
	//다음 ArrayList에서 네번째 데이터 "four"를 제거하고 
	//결과를 for-each문으로 출력해보세요. 
	public static void main(String[] args) {
		ArrayList<String> number = new ArrayList<String>();
		number.add("one");
		number.add("two");
		number.add("three");
		number.add("four");
		
		System.out.println("삭제전");
		for(int i=0;i<number.size();i++)
			System.out.println(number.get(i));
		
		System.out.println();
		System.out.println("삭제후");
		number.remove(3);
		for(String temp : number)
			System.out.println(temp);
		
	}//main end

}//class end
