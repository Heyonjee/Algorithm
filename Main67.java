package test;

import java.math.BigInteger;
import java.util.Scanner;

public class Main67 {

	public static void main(String[] args) {

		
		
		
		/*
		 * <문제>
		 * 두 정수 A와 B가 주어졌을 때, 두 수의 곱을 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 정수 A와 B가 주어진다. 두 정수는 0보다 크거나 같은 정수이며, 0을 제외한 정수는 0으로 시작하지 않으며, 수의 앞에
		 * 불필요한 0이 있는 경우도 없다. 또한, 수의 길이는 300,000자리를 넘지 않는다.
		 * 두 수의 곱을 출력한다.
		 */
		
		Scanner sc2 = new Scanner(System.in); //스캐너 선언
		
		BigInteger a= sc2.nextBigInteger(); //큰 수이기 때문에 BigInteger사용
		BigInteger b= sc2.nextBigInteger();
		
		System.out.println(a.multiply(b)); //곱하기
		
		
		
		

		
		
		/*
		 * <문제>
		 * 입력 받은 대로 출력하는 프로그램을 작성하시오.
		 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를
		 * 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
		 * 입력받은 그대로 출력한다.
		 */
		Scanner sc= new Scanner(System.in); //스캐너 선언
		
		while(sc.hasNext()) { //다음 입력값이 없을 때까지 반복
			String str=sc.nextLine(); //한줄 단위로 입력
			
			System.out.println(str); //한줄 단위로 출력
		}
		sc.close();
		
	}

}
