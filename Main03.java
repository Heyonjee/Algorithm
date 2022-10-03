package test;

import java.math.BigInteger;
import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {

		
		
		/*
		 * <문제>
		 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		 * A가 B보다 큰 경우에는 '>'를 출력한다. 
		 * A가 B보다 작은 경우에는 '<'를 출력한다.
		 * A와 B가 같은 경우에는 '=='를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int a=0 ,b=0;
		a=sc.nextInt();
		b=sc.nextInt();
		
	
	
		
		if(a>b) { 
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
		
		/*
		 * <문제>
		 * 두 수 C, D를 입력받아, C+D, C-D, C×D를 구하는 프로그램을 작성하시오.
		 * 각각을 출력할 때, 답이 0인 경우를 제외하고는 0으로 시작하게 해서는 안 된다(1을 01로 출력하면 안 된다는
		 * 의미).
		 */
		
		
		BigInteger c = sc.nextBigInteger();
		BigInteger d = sc.nextBigInteger();
		
	
		
		System.out.println(c.add(d));
		System.out.println(c.subtract(d));
		System.out.println(c.multiply(d));
		
		
		
		
		/*
		 * <문제>
		 * ACM-ICPC 인터넷 예선, Regional, 그리고 World Finals까지 이미 2회씩 진출해버린 kriii는 미련을 버리지 못하고
		 * 왠지 모르게 올해에도 파주 World Finals 준비 캠프에 참여했다. 대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를
		 * 출력해주자.
		 * 두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
		 */
		
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		
		
		
		
		/*
		 * <문제>
		 * 정수 N개로 이루어진 수열 W와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
		 * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
		 * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
		 */
		int n = sc.nextInt();
		int x= sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			
			int w=sc.nextInt();
			
			if(w<x) {
				System.out.print(w+" ");
			}
		
		}
		
		
		
		
	}
	

}
