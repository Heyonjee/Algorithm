package test;

import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		
		/*
		 * <문제> 
		 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc= new Scanner(System.in); //스캐너 선언
		int ac = sc.next().charAt(0); //문자열을 받아서 charAt()함수로 잘라 문자로 변환 => int자료형 변수에 저장하여 문자에 대응되는 값 저장

		System.out.println(ac);
	}

}
