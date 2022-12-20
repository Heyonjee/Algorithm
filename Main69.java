package test;

import java.util.Scanner;

public class Main69 {

	public static void main(String[] args) {

		
		
		/*
		 * <문제>
		 * 홍익대학교는 1946년에 개교하였다.
		 * 특정 년도가 주어졌을 때, 그 해가 개교 몇 주년인지 출력하라.
		 * 단, 홍익대학교는 없어지지 않는다고 가정한다.
		 * -입력 : Scanner 사용
                  Scanner sc = new Scanner(System.in); 정수: sc.nextInt(); 실수: sc.nextDouble(); 문자열: sc.nextLine(); 또는 sc.next();
           -출력 : System.out.println(var);
           -필수 라이브러리 java.util.Scanner
		 */
		
		Scanner sc =new Scanner(System.in);
		
		int year=sc.nextInt(); //특정 년도
		int var=year-1946; //개교 몇 주년인지 계산!
		
		System.out.println(var);
		
	}

}
