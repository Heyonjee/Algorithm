package test;

import java.util.Scanner;

public class Main22 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
		 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
		 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. 
		 * S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
		 * 각 테스트 케이스에 대해 P를 출력한다.
		 */
		Scanner sc = new Scanner(System.in); //스캐너 선언
		int t= sc.nextInt(); // 테스트 케이스 개수
		
		for(int i=1; i<=t; i++) {
			int r= sc.nextInt(); //첫번째 문자 반복 횟수
			
			String s=sc.next(); //문자열 받기
			
			for(int j=0; j<s.length(); j++) { //문자열 s를
				
				for(int k=1; k<=r; k++) {  //r만큼 반복
					
					System.out.print(s.charAt(j)); //각 문자를 한줄에 출력
				}
			}
			
			System.out.println(); //각 테스트 케이스를 다른 줄에 출력하기 위함
			
		}
		
		
		
		
		
		
		
		
	}

}
