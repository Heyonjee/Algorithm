package test;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {

		
		
		/*
		 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오. 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다.
		 * 단어의 길이는 최대 100이다. 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다. => pulljima
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		System.out.println(word.length());
		
		
		
		
		/*
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
	
		
		
		
		
		
	}

}
