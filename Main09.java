package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main09 {

	public static void main(String[] args) throws IOException { //예외처리

		
		/*
		 * <문제>
		 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다.
		 * A와 B는 1 이상, 1,000 이하이다.
		 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
		 * 단, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용하라.
		 */
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); //BufferedReader 선언
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));//BufferedWriter 선언
		
		int t = Integer.parseInt(br.readLine()); //readLine의 리턴값은 String이므로 정수형으로 변환
		
		for(int i=1; i<=t; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()+" "); //공백단위로 끊어서 처리
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n"); //개행처리
		}
		
		
		bw.flush(); //남은 데이터 모두 출력
		
		
		
		
		/*
		 * <문제> 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는다.
		 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.  =>BufferedReader와 BufferedWriter 사용하기
		 */
		int n = Integer.parseInt(br.readLine());
		
		
		
		for(int i=1; i<=n; i++) {     //이중 for문 사용
			for(int j=1; j<=i; j++) {
				bw.write("*");
			}
			
			bw.newLine(); //줄바꿈
		}	
			bw.flush();
			
			
			
		
			
		/*
		 * <문제> 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 출력한다.
		 * 단, 오른쪽을 기준으로 별을 정렬하고 첫째줄부터 N번째 줄까지 차례대로 별을 출력한다. => BufferedReader와 System.out.print() 사용하기
		 */
			
			
		int m = Integer.parseInt(br.readLine());
		
		br.close();
		
		for(int i=1; i<=m; i++) {  //다중 for문 사용
			for(int j=1; j<=m-i; j++) {
				System.out.print(" "); //한 행에 찍어야하기 때문에 print
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*"); //한 행에 찍어야하기 때문에 print
			}
			System.out.println();  //한 행의 출력이 끝났기 때문에 줄바꿔줌	
		}
		
		bw.close();
			
			
		
	}
	
	
	
	

}
