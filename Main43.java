package test;

import java.util.Scanner;

public class Main43 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500) 
		 * 첫째 줄에 구한 0의 개수를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		//0의 개수 ------> 2*5=10의 개수
		int two=0;  // 2
		int five=0; // 5
		
		for(int i=1; i<=n; i++) {
			
			int num = i; //n까지의 각각의 수
			
			while(num%2==0) { //2의 개수
				two++;
				num=num/2;
				
			}
			
			while(num%5==0) { //5 개수
				five++;
				num=num/5;
				
			}
		}
		
		//2*5로 만들수 있는 10의 개수출력=> 더 작은 개수 출력
		if(two>five) {
			System.out.println(five);
		}else {
			System.out.println(two);
		}
	}

}
