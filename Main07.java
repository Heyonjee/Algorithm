package test;

import java.util.Scanner;

public class Main07 {

	
	
	
	
	public static void main(String[] args) {
		
		
		/*
		 * <문제>
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
		
		 
		
		 /*
		 * <문제> 
		 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		 */
		 int n = sc.nextInt();
		 int sum=0;
		 
		 
		 for(int i=1; i<=n; i++) {
			 sum +=i;
		 }
		 System.out.println(sum);
		 
		 
		 
		/*
	     * <문제>
	     * M을 입력받은 뒤, 구구단 M단을 출력하는 프로그램을 작성하시오. M*1부터 M*9까지 출력한다.
	     */
		 int m=sc.nextInt();
		 int result=0;
		 sc.close();
		 
		 for(int i=1; i<=9; i++) {
			 result=m*i;
			 System.out.println(m+" * "+i+" = "+result);  //=>출력형태의 빈칸이 들어가있음을 유의
		 }
		
	}

	
}
