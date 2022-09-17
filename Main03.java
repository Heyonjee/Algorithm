package test;

import java.math.BigInteger;
import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {

		
		
		/*
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
		 * 두 수 C, D를 입력받아, C+D, C-D, C×D를 구하는 프로그램을 작성하시오.
		 * 각각을 출력할 때, 답이 0인 경우를 제외하고는 0으로 시작하게 해서는 안 된다(1을 01로 출력하면 안 된다는
		 * 의미).
		 */
		
		
		BigInteger c = sc.nextBigInteger();
		BigInteger d = sc.nextBigInteger();
		
		sc.close();
		
		System.out.println(c.add(d));
		System.out.println(c.subtract(d));
		System.out.println(c.multiply(d));
		
		
		
		
		/*
		 * ACM-ICPC 인터넷 예선, Regional, 그리고 World Finals까지 이미 2회씩 진출해버린 kriii는 미련을 버리지 못하고
		 * 왠지 모르게 올해에도 파주 World Finals 준비 캠프에 참여했다. 대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를
		 * 출력해주자.
		 * 두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
		 */
		
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		
		
		
		
		
		
		
		
	}
	

}
