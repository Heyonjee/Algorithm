package test;

import java.util.Scanner;

public class Main07 {

	
	
	
	
	public static void main(String[] args) {
		
		
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.
		 * 각 테스트 케이스마다 A+B를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		 int c = sc.nextInt();
		 int arr[]=new int[c];
		 
		 for(int i=0; i<c; i++) {
			 int a = sc.nextInt();
			 int b = sc.nextInt();
			 arr[i] = a+b;
		 }
		 
		
		 
		 for(int t : arr) {
			 System.out.println(t);
		 }
		
		 
		 //n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		 int n = sc.nextInt();
		 int sum=0;
		 sc.close();
		 
		 for(int i=1; i<=n; i++) {
			 sum +=i;
		 }
		 System.out.println(sum);
		
	}

	
}
