package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;




public class Main12 {

	public static void main(String[] args) throws IOException {
		
		
		
		/*
		 * <문제>
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 입력이 끝날 때까지 각 테스트 케이스마다 A+B를 출력한다. => EOF에 대해 알아보기
		 */
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
	/*	
	 * 백준 알고리즘에서 통과한 코드지만 이클립스에서 실행했을 때 EOF : ctrl+z가 실행될 때도 있고 안될 때도 있음
	 * StringBuilder sb1 = new StringBuilder();
		StringTokenizer st1;
		String str1;
		while((str1=br.readLine()) != null) {
		
			st1=new StringTokenizer(str1, " ");
			
			int c=Integer.parseInt(st1.nextToken());
			int d=Integer.parseInt(st1.nextToken());
			
			sb1.append(c+d).append("\n");  //문자열 붙이기	
			
		}
		System.out.println(sb1);
	*/
		
		
		
		//throws 처리가 아닌 try-catch로 처리한 코드
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		try {
			while((str=br.readLine()) != null) {
				st= new StringTokenizer(str, " ");
				int a= Integer.parseInt(st.nextToken());
				int b= Integer.parseInt(st.nextToken());
				sb.append(a+b).append("\n");
				
			}
		} catch (NoSuchElementException e) {
			System.out.print(sb);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
