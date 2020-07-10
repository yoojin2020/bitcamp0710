package bcs.day05;

public class TryMethod2a {

	// main에서 배열의 크기(s)를 정해서 전달하면
	// makeArray라는 메소드에서 이를 받아 해당 길이만큼의 제곱수열을 값으로 하는 배열을 return하고
	// (예: s=5일 경우, {1, 4, 9, 16, 25}
	// 이 리턴값을 B라는 배열에 할당하여 출력하려고 합니다.
	// 메소드를 완성하고 오류를 해결하세요.
	public static int[] makeArray(int size) {
		int[] A = new int[size];
		for(int i=0;i<size;i++)
				A[i]=(i+1)*(i+1);
		return A;
	}

	public static void main(String[] args) {
		int s = 7;
		int[] B = makeArray(s);
		for (int temp : B)
			System.out.print(temp+"\t");

	}// main end

}// class end
