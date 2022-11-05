package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main28 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
		 * 첫째 줄에 정렬하려고 하는 수 N이 주어진다.
		 * N은 1,000,000,000보다 작거나 같은 자연수이다.
		 * 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
		 */
		Scanner sc= new Scanner(System.in); //스캐너 선언
		
		char[] arr=sc.nextLine().toCharArray(); //char형 배열선언 => toCharArray()로 하나의 문자열을 각 자리의 문자(아스키값)으로 변환!	
		                                        //주의) 지금은 숫자를 나열하는 것이기 때문에 상관없지만 연산을 할 경우에는 아스키코드값을 정수값으로 변환해줘야함!
		
		Arrays.sort(arr); //배열 오름차순 정렬
		
		for(int i=arr.length-1; i>=0; i--) { //for문으로 내림차순 정렬
			System.out.print(arr[i]); //한줄에 출력
		}
	
	}

}
