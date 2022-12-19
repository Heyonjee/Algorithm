package test;

import java.math.BigInteger;
import java.util.Scanner;

public class Main68 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 A와 B (-1010000 ≤ A, B ≤ 1010000)가 주어진다.
		 * 첫째 줄에 A+B를 출력한다.
		 */
		Scanner sc= new Scanner(System.in);
		
		BigInteger a= sc.nextBigInteger(); //큰 수이기 때문에 BigInteger사용
		BigInteger b= sc.nextBigInteger();
		System.out.println(a.add(b)); //a+b 출력
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * <문제> 
		 * Print out the word Hook as shown below.
		 */
		System.out.println("#  # #### #### #  #");
		System.out.println("#### #  # #  # # #");
		System.out.println("#### #  # #  # # #");
		System.out.println("#  # #### #### #  #");
		
	}

}
