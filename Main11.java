package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		
		/*
		 * <문제>
		 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		 * 입력 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
		 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		 * 출력 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //bufferedreader 선언
		
		int n = Integer.parseInt(br.readLine()); //정수 n개 반복
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); //공백단위로 처리
		
		int [] arr = new int[n]; //배열 변수 선언
		br.close();
		
		for(int i=0; i<n; i++) { //n만큼 반복
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int min=arr[0]; //최소값, 최대값 변수설정 및 초기화
		int max=arr[0];
		
		for(int i=1; i<n; i++) { //n만큼 반복
			if(min>arr[i]) { //최소값 비교
				min=arr[i];
			}
			if(max<arr[i]) { //최대값 비교
				max=arr[i];
			}
		}
		System.out.print(min+" "+max);
		
	
	}

}
