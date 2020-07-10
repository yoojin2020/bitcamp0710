package bcs.day04;

import java.util.Arrays;

public class ArrayNew {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		
		int[] arr1 = new int[5];
		int arr2[] = new int[3];
		int arr3[] = {1,2,3};
		
		//int[4] arr4 = new int[];
		//int[] arr5 = new int[];
		
		//초기화
		int[] arr6 = new int[] {2,3,4};
		//int[] arr7; arr7 = {4,5,6,7};
		//int[] arr8 = new int[6] {1,2,3,4,5,6};
		
		//출력1) for문으로
		for(int i=0 ; i<arr6.length ; i++)
			System.out.println("arr6["+i+"]="+arr6[i]);
		
		//출력2) for each
		for(int temp:arr6)
			System.out.print(temp+" ");
		
		System.out.println();
		
		//출력3) Array.toString(배열이름)
		System.out.println(Arrays.toString(arr6));
		
		int[] data1, data2, data3;
		int data4[], data5, data6;
		
		data4 = new int[10];
		System.out.println(data4);
		System.out.println(data4[3]);
		
		//배열 복사하기
		data1 = new int[] {2,3,4,5,6,7,54};
		data4 = data1;

		System.out.println("data1:"+data1+" "+Arrays.toString(data1));
		System.out.println("data4:"+data4+" "+Arrays.toString(data4));
		
		data1[4]=33;
		System.out.println("data1:"+data1+" "+Arrays.toString(data1));
		System.out.println("data4:"+data4+" "+Arrays.toString(data4));

	}// main end

}// class end
