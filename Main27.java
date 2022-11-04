package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main27 {

	public static void main(String[] args) throws IOException {
		
		
		/*
		 * <문제>
		 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
		 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
		 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
		 */
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 선언
		StringBuilder sb=new StringBuilder(); //StringBuilder 선언
		
		int n=Integer.parseInt(br.readLine());
		
		int[] arr=new int[n]; //배열선언
		
		for(int i=0; i<n; i++) { //배열에 숫자 담기
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr); //정렬
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i]).append('\n'); //배열에 숫자 담고 개행문자 포함 
		}
		System.out.println(sb);
		
		
	}

}
  