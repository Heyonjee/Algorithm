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
		br.close();
		
		bw.flush(); //남은 데이터 모두 출력
		bw.close();
	}

}
