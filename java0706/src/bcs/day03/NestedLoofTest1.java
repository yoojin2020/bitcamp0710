package bcs.day03;

public class NestedLoofTest1 {

	public static void main(String[] args) {
		
		int i = 2;
		while(i<10) {
			System.out.println("*** "+i+"´Ü ***");
			for(int j=1 ; j<10 ; j++)
					System.out.println(i+ "*" +j+ "=" +i*j);
			
			System.out.println();
			i++;
		}

	}// main end

}// class end
