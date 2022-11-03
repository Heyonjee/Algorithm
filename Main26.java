package test;

import java.util.Scanner;

public class Main26 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
		 * 단, 대문자와 소문자를 구분하지 않는다.
		 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
		 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
		 */
		
		Scanner sc=new Scanner(System.in); //스캐너 선언
		
		int[] arr=new int[26];  //알파벳 26개
		
		String str= sc.next(); //문자열 받기
		
		for(int i=0; i<str.length(); i++) { //문자열의 길이만큼 반복해서 비교
			
			// A:65 ~ Z:90     ,  a:97 ~ z:122
			
			if(65<=str.charAt(i) && str.charAt(i)<=90) { //대문자의 범위
				arr[str.charAt(i)-65]++; //해당 인덱스의 값 +1
			
			}else {  //소문자의 범위 
				arr[str.charAt(i)-97]++;
			}
			
		}
		
		int max = -1;
		char ch ='?';
		
		for(int i=0; i<26; i++) {
			if(arr[i]>max) {
				max=arr[i];
				ch = (char)(i+65); // char형 타입의 변수에 int와 char를 연산하여 저장할 경우 반드시 캐스팅! 대문자 출력해야 하기 때문에 +65
			
			}else if(arr[i]==max){
				ch='?';
			}
		}
		
		System.out.println(ch);
		
	}

}
