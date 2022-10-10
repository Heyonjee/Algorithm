package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main13 {

	public static void main(String[] args) throws IOException {

		
		/*
		 * <문제>
		 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		 * 첫째줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
		 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //bufferedreader 선언
		int[] arr=new int[9]; //배열선언
		
		
		for(int i=0; i<9; i++) {
			arr[i]=Integer.parseInt(br.readLine()); //줄 단위로 데이터 받기
		}
		
		int max=0; //최대값 변수 초기화
		int count=0; //몇번째 숫자인지 세기 변수 초기화
		
		for(int i=0; i<9; i++) {
			
			
			if(arr[i]>max) {
				max=arr[i];
				count=i;
				
			}
		
		}
		System.out.println(max);
		System.out.println(count+1); //배열은 0번째 자리부터 시작이니까 +1을 해줘야함
		
		
	}

}
