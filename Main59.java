package test;

import java.util.Scanner;

public class Main59 {

	public static void main(String[] args) {

		/*
		 * <문제>
		 * 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
		 * 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine(); //단어 입력
		
		for(int i=0; i<str.length(); i++) {
			
			char c=str.charAt(i); //알파벳 1개
			
			if(Character.isUpperCase(c)) { //문자가 대문자인 경우
				System.out.print(String.valueOf(c).toLowerCase()); //소문자로 변환 
			
			}else { //반대의 경우(문자가 소문자일 경우)
				System.out.print(String.valueOf(c).toUpperCase()); //대문자로 변환
			}
		}
		
	}

}
