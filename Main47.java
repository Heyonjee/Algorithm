package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main47 {

	public static void main(String[] args) throws IOException {

		/*
		 * <문제>
		 * 영어 문장과 알파벳 하나가 주어지면 그 알파벳이 문장에서 몇 번 나타나는지를 세는 프로그램을 작성하시오.
		 * 입력은 몇 개의 줄들로 이루어진다. 각 줄에는 하나의 소문자와 영어 문장이 공백으로 구분되어 주어진다.
		 * 각 문장은 길이가 1에서 250이며 입력의 마지막은 #이다.
		 * 출력의 각 줄은 입력으로 주어진 소문자와 그 소문자 알파벳이 나타난 횟수로 이루어진다.
		 * 이때 문장에서 해당 알파벳이 소문자로 나타나던 대문자로 나타나던 모두 세야 한다.
		 */
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String n= br.readLine(); //문장을 입력받아야 하기 때문
			
			if(n.equals("#")) { 
				break; //시스템 종료
			}
			
			StringTokenizer st= new StringTokenizer(n, " "); //공백으로 구분
			char givenletter = st.nextToken().charAt(0); //주어진 알파벳
			
			String str=""; //문장

			while(st.hasMoreTokens()) {
				str=str+st.nextToken(); //이어붙이기
			}
			
			
			System.out.println(givenletter+" "+countletter(givenletter, str)); //주어진 알파벳, 함수호출
			
		 }
				
		}
	
	private static int countletter(char givenletter, String str) { //주어진 알파벳과 같은 알파벳 개수 세는 함수생성
		int count=0;
		for(char letter:str.toLowerCase().toCharArray()){ // toLowerCase(): 문장 소문자로 변환
			if(letter==givenletter) {
				count++;
			}
	    }
			return count;
	}
}
