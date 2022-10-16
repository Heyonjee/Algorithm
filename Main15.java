package test;

import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		
		/*
		 * <문제> 
		 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc= new Scanner(System.in); //스캐너 선언
		
		int ac = sc.next().charAt(0); //문자열을 받아서 charAt()함수로 잘라 문자로 변환 => int자료형 변수에 저장하여 문자에 대응되는 값 저장

		System.out.println(ac);
		
		
		
		/*
		 * <문제>
		 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		 * 입력 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		 */
		
		int n,sum = 0;
		n=sc.nextInt();
		String str=sc.next(); //문자열 받기
		
		for(int i=0; i<n; i++) {
			sum+=str.charAt(i)-'0'; //charAt() :해당문자의 아스키코드값 반환, 반드시 -'0' 혹은 -48해줘야 입력받은 숫자 그대로 사용가능
			
		}
		System.out.println(sum);
		
		
		
		
		/*
		 * <문제>
		 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		 * 입력 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
		 * 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
		 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
		 */
		
		
		String s = sc.next(); //문자열로 받기
		int[] alphabet = new int[26];
		
		for(int i=0; i<26; i++) {
			alphabet[i]=s.indexOf('a'+i);  // => indexOf() : 입력받은 문자나 문자열이 있으면 해당 문자의 처음 발견 위치값을 리턴하고 없으면 -1을 리턴!! 
			System.out.print(alphabet[i]+" ");
		}
		
		
		
		
	}

}
