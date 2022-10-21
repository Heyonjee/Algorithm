package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
		 * 입력 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다.
		 * 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
		 * 출력 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
		 */
		Scanner sc= new Scanner(System.in); //스캐너 선언
		int n=sc.nextInt();
		int[] arr= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr); // => Arrays.sort() : 자바 기본제공 정렬메소드
		
		for(int a:arr) {
			System.out.println(a);
		}




		/*
		 * <문제>
		 * 정수 M이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오. 첫째 줄에 정수 M (1 ≤ M ≤ 10,000,000)이 주어진다.
		 * M의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. M이 1인 경우 아무것도 출력하지 않는다.
		 */
		
		int m = sc.nextInt();
		
		for(int i=2; i<=m; i++) {
			while(m%i==0) {
				System.out.println(i);
				m=m/i;  //연산기호  => m/=i
			}
			
		}
		if(m!=1) {
			System.out.println(m);
		}
		
		
		
		
	}

}