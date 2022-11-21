package test;

import java.util.Scanner;

public class Main46 {

	public static void main(String[] args) {

		
		/*
		 * <문제> 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍어라.
		 * 하지만, 오른쪽을 기준으로 정렬하여 출력하시오.
		 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 첫째줄 별 개수
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<i; j++) { //왼쪽부터 공백출력
				System.out.print(" ");
			}
			
			for(int j=n; j>=i; j--) { //공백 다음부터 별 출력
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
