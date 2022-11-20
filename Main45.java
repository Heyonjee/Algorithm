package test;

import java.util.Scanner;

public class Main45 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍어라.
		 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다. 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //첫째줄 별 개수

		for(int i=1; i<=n; i++ ) { //첫째줄부터 n번째 줄까지 반복
			
			for(int j=n; j>=i; j--) { //한줄에 찍는 별 개수 하나씩 감소
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
