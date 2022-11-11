package test;

import java.util.Scanner;

public class Main34 {

	public static void main(String[] args) {

		
		
		/*
		 * <문제>
		 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
		 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
		 * 주어진 수들 중 소수의 개수를 출력한다.
		 */
		
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt(); // 주어지는 수의 개수
		
		int num=0; //소수인지 판별할 수
		
		int count=0; //소수 개수
		
		for(int i=0; i<n; i++) { //주어진 수의 개수만큼 반복
			
			num=sc.nextInt();    
			
			for(int j=2; j<=num; j++) { //1은 모든 수의 약수이기 때문에 2부터 시작
				if(j==num) {
					count++;
				}
				if(num%j==0) { //자기 자신 이외의 약수가 있는 수를 거를 수 있음
					break;
				}
				
			}
		}
		System.out.println(count);
		
		
		
	}

	

}
