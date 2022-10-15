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
		
		
		
		/*
		 * <문제>
		 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		 * 입력 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		 */
		
		int n,sum = 0;
		n=sc.nextInt();
		String str=sc.next(); //문자열 받기
		
		for(int i=0; i<n; i++) {
			sum+=str.charAt(i)-'0'; //charAt() :해당문자의 아스키코드값 반환, 반드시 -'0' 혹은 -48해줘야 입력받은 숫자 그대로 사용가능
			
		}
		System.out.println(sum);
		
	}

}
