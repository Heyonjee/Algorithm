package test;

import java.util.Scanner;

public class Main55 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
		 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(); //숫자 입력
		
		for(int i=1; i<=n; i++) { //i=1부터 시작
			System.out.println(i);
		}
	}

}
