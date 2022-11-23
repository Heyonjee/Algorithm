package test;

import java.util.Scanner;

public class Main48 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 영문 문장을 입력받아 모음의 개수를 세는 프로그램을 작성하시오.
		 * 모음은 'a', 'e', 'i', 'o', 'u'이며 대문자 또는 소문자이다.
		 * 입력은 여러 개의 테스트 케이스로 이루어져 있으며, 각 줄마다 영어 대소문자, ',', '.', '!', '?', 공백으로 이루어진 문장이 주어진다.
		 * 각 줄은 최대 255글자로 이루어져 있다. 입력의 끝에는 한 줄에 '#' 한 글자만이 주어진다.
		 * 각 줄마다 모음의 개수를 세서 출력한다.
		 */
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			String str=sc.nextLine(); //문장 입력받기
			str=str.toLowerCase(); //소문자로 변환
			
			if(str.equals("#")){ //#입력시 종료
				break;
			}
			
			char[] arr= {'a','e','i','o','u'};
			
			int count=0; //모음의 개수 => 한 문장 끝났을 때마다 초기화 되어야 해서 while문 안에 존재
			
			for(int i=0; i<str.length(); i++) { //문장길이만큼 반복
				char c = str.charAt(i);
				for(int j=0; j<arr.length; j++) { //char배열 길이만큼 반복
					if(c==arr[j]) {
					count++;
					}
				}
				
			}
			System.out.println(count);
		}
	}

}
