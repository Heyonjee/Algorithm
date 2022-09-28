package test;

import java.util.Scanner;

public class Main08 {
	
	/*
	 * <문제>
	 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
	 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
	 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
	 */
	
	
	public static int h(int n) {
		
		int cnt=0;   //=> 한수 카운팅
		
	
		if(n<100) { //=>1~99까지는 그 자체가 수열 
			return n;
	
		}else {
			cnt=99; //=> 100이상의 수는 한수가 최소 99개이기 때문에 99로 초기화 시킨다.
		
			for(int i=100; i<=n; i++) {
				int hun=i/100;     // => 백의 자릿수
				int ten=(i/10)%10; // => 십의 자릿수
				int one=i%10;      // => 일의 자릿수
			
				if((hun-ten)==(ten-one)) { //=> 각 자리가 등차수열
					cnt++;
			}
		}
	}
	return cnt;
	
	
	
	}		
			



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(h(n));
		

	}

}
