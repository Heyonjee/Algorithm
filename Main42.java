package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main42 {

	public static void main(String[] args) throws IOException {

		
		/*
		 * <문제> 
		 * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
		 * 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine(), " "); //공백으로 문자열 구분
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int gcd=gcd(a,b); //최대공약수(Greatest Common Divisor)
		
		int lcm=lcm(a,b);  //최소공배수(Least Common Multiple) 
		
		System.out.println(gcd);
		System.out.println(lcm);
	}



//최대공약수 재귀함수 =>Main36 class에서는 반복문 형태 
public static int gcd(int a, int b) {
	if(b==0) {
		return a;
	}
		return gcd(b, a%b);  // gcd(a,b)=gcd(b,r)-----> r=a%b
	
	}

//최소공배수 = 두수의 곱/최대공약수
public static int lcm(int a, int b) {
	return a*b/gcd(a,b);
}
}
