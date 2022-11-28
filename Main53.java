package test;

import java.util.Scanner;

public class Main53 {

	public static void main(String[] args) {

		
		
		/*
		 * <문제>
		 * 컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다.
		 * 고유번호의 처음 5자리에는 00000부터 99999까지의 수 중 하나가 주어지며 6번째 자리에는 검증수가 들어간다.
		 * 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
		 * 예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.
		 * 첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
		 * 첫째 줄에 검증수를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int verification_Num=0; //검증수
		int n=0; //각 자리수
		
		for(int i=1; i<=5; i++) { //5자리 반복
			n=sc.nextInt(); //각 자리 수 입력
			
		verification_Num = (int) (verification_Num + Math.pow(n, 2)); //Math.pow(base, exponent) 함수: base^exponent 값 반환 =>기본형이 double이므로 int형으로 casting
		}
		
		System.out.println(verification_Num%10);
	}

}
