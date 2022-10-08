package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main10 {

	public static void main(String[] args) throws IOException {

		
		/*
		 * <문제>
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 입력 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 출력 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
		 * x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		 */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //BufferedReader 선언
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); //BufferedWriter 선언
		
		int t=Integer.parseInt(br.readLine()); //자료형 변환, throws IOException 처리
		
		
		
		int a,b=0; // 변수 초기화=> 쓸모없는 값 들어가지 않게
		
		for(int i=1; i<=t; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine()+" "); //공백단위로 끊어서 처리
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
		}
		bw.flush();
		
		
		
		
		
		/*
		 * <문제>
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 입력이 끝날 때까지 각 테스트 케이스마다 A+B를 출력한다. => EOF에 대해 알아보기
		 */
		
		int c,d=0; //변수초기화 
		StringBuilder sb = new StringBuilder();
		StringTokenizer st2;
		String str;
		while((str=br.readLine()) != null) {
		
			st2=new StringTokenizer(str, " ");
			
			c=Integer.parseInt(st2.nextToken());
			d=Integer.parseInt(st2.nextToken());
			
			sb.append(c+d).append("\n");  //문자열 붙이기	
		}
		System.out.println(sb);
	
		br.close();
		bw.close();
		
		
		
		
		
		
		
		
	}

}
