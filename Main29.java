package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main29 {

	public static void main(String[] args) throws IOException {

		/*
		 * <문제>
		 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
		 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
		 * 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
		 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader 선언
		int n=Integer.parseInt(br.readLine()); //형변환
		
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> list = new ArrayList<>(); //List에 숫자담기
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list); //오름차순 정렬
		
		for(int num:list) { //향상된 for문
			sb.append(num).append('\n'); //출력형태
		}
		System.out.print(sb);
	}

}
