package test;

import java.util.Scanner;

public class Main31 {

	public static void main(String[] args) {
		
		/*
		 * <문제>
		 * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
		 * 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다. 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
		 * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
		 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597 n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다. 첫째 줄에 n번째 피보나치 수를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); // 숫자 입력받기
		
		System.out.println(fibonacci(n)); //피보나치 함수(재귀함수) 호출 => 재귀함수란 하나의 함수에서 자신을 다시 호출하여 작업을 수행하는 방식

	}
	
	static int fibonacci(int n) { //피보나치 함수 : 반환값(리턴값)이 있으니 static으로 생성! =>리턴값 없을 시 void
		                          //같은 클래스 안에서 호출되는 것이기 때문에 public 없어도 됌! =>모든 클래스에서 해당 객체를 사용할 수 있게 하려면 public 선언
		if(n==0) return 0;
		if(n==1) return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
