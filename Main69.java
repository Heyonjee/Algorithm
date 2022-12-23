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
		
		
		
		
		
		
		
		
		
		
		/*
		 * <문제>
		 * 버스 운전수 비와이 씨가 운전하는 버스(verse아님 ㅎ)는 N개의 정거장을 거친 후 종착역에 도착한다.
		 * 각 정거장은 내릴 인원수와 올라탈 인원수가 정해져 있다. 종착역에 도착하면 버스에 타고 있던 모든 사람이 내린다.
		 * 첫 줄에 출발역과 종착역을 제외한 정거장의 수 N(1 ≤ N ≤ 100,000)과 출발역에서 탑승하는 사람의 수 K(1 ≤ K ≤ 10,000)가 주어진다.
		 * 둘째 줄부터 N개의 줄에 걸쳐 각 줄마다 i번째 정거장에서 탑승하는 인원 A와 하차하는 인원 B가 주어진다.(0 ≤ A, B ≤ 10,000)
		 * 종착역에 도착했을 때, 버스 운전수의 이름을 출력해라.
		 */
		System.out.println("비와이"); //결국은 버스 운전수의 이름을 출력하면 된다.(조건은 아무런 관계가 없다...)
		
	}

}
