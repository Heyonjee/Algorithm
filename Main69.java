package test;

import java.util.Scanner;

public class Main69 {

	public static void main(String[] args) {

		
		
		/*
		 * <문제>
		 * 홍익대학교는 1946년에 개교하였다.
		 * 특정 년도가 주어졌을 때, 그 해가 개교 몇 주년인지 출력하라.
		 * 단, 홍익대학교는 없어지지 않는다고 가정한다.
		 * -입력 : Scanner 사용
                  Scanner sc = new Scanner(System.in); 정수: sc.nextInt(); 실수: sc.nextDouble(); 문자열: sc.nextLine(); 또는 sc.next();
           -출력 : System.out.println(var);
           -필수 라이브러리 java.util.Scanner
		 */
		
		Scanner sc =new Scanner(System.in);
		
		int year=sc.nextInt(); //특정 년도
		int var=year-1946; //개교 몇 주년인지 계산!
		
		System.out.println(var);
		
		
		
		
		
		
		
		
		
		/*
		 * <문제>
		 * 홍준은 참 팬이 많다. 이를 본 구사과는 BOJ 슬랙에서 이모티콘을 만들었다.
		 * 홍준의 아이디가 주어지면 구사과가 만든 이모티콘을 출력하는 프로그램을 작성하여라. 
		 * 첫 번째 줄에 홍준의 아이디를 입력받는다. 홍준의 아이디는 길이가 20 이하인 문자열이며, 알파벳 소문자, 알파벳 대문자, 숫자로만 이루어졌다.
		 * 3개의 줄에 걸쳐, 팬들에게 둘러싸인 홍준의 모습을 출력한다.
		 * 홍준아이디 출력형태=> :홍준아이디: 
		 * 팬 출력형태=> :fan:
		 */
		String id=":"+sc.next()+":"; //홍준아이디
		
		System.out.println(":fan::fan::fan:");
		System.out.println(":fan:"+id+":fan:");
		System.out.println(":fan::fan::fan:");
		
		
		
	}

}
