package test;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {

		
		
		/*
		 * <문제>
		 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오. 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다.
		 * 단어의 길이는 최대 100이다. 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다. => pulljima
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		System.out.println(word.length());
		
		
		
		
		/*
		 * <문제>
		 * 두 정수 A와 B를 입력받은 다음, A+B , A-B, A/B, A*B 를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 첫째 줄에 A+B, A-B, A/B, A*B 를 출력한다.
		 */
		
		int A = 0;
		int B = 0;
		A = sc.nextInt();
		B = sc.nextInt();
		
		
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println((double)A/B);
		System.out.println(A*B);
		
		
		/*
		 * <문제>
		 * 두 자연수 C와 D가 주어진다. 이때, C+D, C-D, C*D, C/D(몫), C%D(나머지)를 출력하는 프로그램을 작성하시오.
		 * 두 자연수 C와 D가 주어진다. (1 ≤ C, D ≤ 10,000)
		 */
		
		int c,d=0;
		c=sc.nextInt();
		d=sc.nextInt();
		
		sc.close();
		
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c*d);
		System.out.println(c/d);
		System.out.println(c%d);
		
		
		
		
		/*
		 * <문제>
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 p와 q가 주어진다. (0 < A, B < 10)
		 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, p+q를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		 */
		
		int t=0;
		int p, q=0;
		t= sc.nextInt();
		
		for(int i=1; i<=t; i++) {
			p=sc.nextInt();
			q=sc.nextInt();
			
			System.out.println("Case #"+i+": "+(p+q));	
		}
		
			
		
	
		
		
		
		
		
	}

}
