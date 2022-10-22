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
		
		
		
		/*<문제>
		 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		 *둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 *각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		 */
		
			int c= sc.nextInt();  //테스트 케이스 
		             
			for(int i=0; i<c; i++) {
			
			int s =sc.nextInt();  //학생수 
			double[] arr2= new double[s];
			
			double sum=0;  //성적누적 합 :double형
			
			for(int j=0; j<s; j++) {
				int score= sc.nextInt(); //성적입력
				arr2[j]=score;
				sum=sum+score;  //성적누적 합

			}
			
			double avg = (sum/s);
			double count=0; //평균 넘는 학생 수  =>double로 받는 이유: 비율계산시 자료형 통일
			
			for(int j=0; j<s; j++) {
				if(arr2[j]>avg) { //평균 넘는 학생 수 
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", ((count/s)*100));   //%.3f => 소수점 셋째자리까지 출력!  %% => "%" 문자를 출력
		
		
	}

}
}