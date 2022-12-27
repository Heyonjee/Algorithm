package test;


import java.util.Scanner;

public class Main73 {

	public static void main(String[] args) {

		
		
		
		/*
		 * <문제>
		 * 제연이는 그의 생일(2000년 3월 3일)을 기념해 자신이 가장 좋아하는 수를 20000303으로 나눈 나머지를 구해 그 수만큼 잠을 자기로 했다.
		 * 제연이가 얼마나 잠을 잘 수 있을지 구하자.
		 * 첫째 줄에 제연이가 가장 좋아하는 수 N이 주어진다. (N ≤ 101,000,000)
		 * N을 20000303으로 나눈 나머지를 출력한다.
		 */
		Scanner sc= new Scanner(System.in); //스캐너 선언
		
		String n= sc.nextLine(); //제연이가 가장 좋아하는 수(string형으로 받았기 때문에 각 자리수별로 for문 안에서 사용)
		long num=0; //숫자가 커서 long형 변수선언
		
		for(int i=0; i<n.length(); i++) { //문자열을 index값을 통해 읽어서 아스키코드값임.=> 숫자값으로 바꾸기 위해 -'0'(==48)해줌
			num = (num*10+(n.charAt(i)-'0')) % 20000303; // 반복할때 자리수를 올려주기 위해 *10			
		}
		System.out.println(num);
		
	}

}
