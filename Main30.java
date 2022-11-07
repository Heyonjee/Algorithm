package test;

import java.util.Scanner;

public class Main30 {

	public static void main(String[] args) {
		
		/*
		 * <문제>
		 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
		 * 첫째 줄에 N!을 출력한다.
		 */
		Scanner sc= new Scanner(System.in); //스캐너 선언
		int n=sc.nextInt(); // 입력범위가 12까지라서(12!=479,001,600) int형 가능 => 13을 넘어가면(13!=6,227,020,800) int형의 범위를 벗어나기 때문에 long형으로 받아야 한다.
		
		int sum=1;
		
		while(n !=0) { //반복문으로 팩토리얼 만들기
			
			sum=sum*n; //1*각 수
			
			n--;  //1씩 줄어든 수 곱하기
			
		}
		System.out.println(sum);
	}

}
