package bcs.day03;

public class IfTest6 {

	public static void main(String[] args) {
		//문제) 아래와 같이 세개의 수가 주어졌을 때, 작은 순서대로 출력되도록 코드를 완성하세요. 
		int a=2,b=4,c=3; //2 6 7 
		  if(a<b && a<c){
			  if(b<c) {System.out.println(a+" "+b+" "+c);}  
			  else {System.out.println(a+" "+c+" "+b);} 
		  }else if(b<c){
		    if(a<c){System.out.println(b+" "+a+" "+c);} 
		    else {System.out.println(b+" "+c+" "+a);} 
		  }else{ 
			if(a<b) { System.out.println(c+" "+a+" "+b);} 
			else {System.out.println(c+" "+b+" "+a);}
		  }

	}

}
