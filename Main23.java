package test;

import java.util.Scanner;

public class Main23 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
		 * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
		 * 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
		 * 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오
		 * 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
		 * 첫째 줄에 상수의 대답을 출력한다.
		 */
		Scanner sc = new Scanner(System.in); //스캐너기능 선언
		int num1=sc.nextInt(); //세자리 수 중 첫번째
		int num2=sc.nextInt(); //두번째
		
		num1= Integer.parseInt(new StringBuilder().append(num1).reverse().toString()); //StringBuilder사용시 append로 문자열 넣기(문자열 연결할때도 마찬가지)
		num2= Integer.parseInt(new StringBuilder().append(num2).reverse().toString()); //StringBuilder사용시 반드시 toString로 StringBuilder타입을 문자열로 바꿔줘야함
																					   //reverse()는 문자열 뒤집기
		
		if(num1<num2) {
			System.out.println(num2);
		}else {
			System.out.println(num1);
		}
	}

}
