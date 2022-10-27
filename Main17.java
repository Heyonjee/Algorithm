package test;

import java.util.Scanner;

public class Main17 {

	public static void main(String[] args) {

		/*
		 * <문제>
		 * 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
		 * 숫자 A이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
		 * 예를 들면, 13까지는 3개, 58까지는 5개를 지난다. 첫째 줄에 A(1 ≤ A ≤ 1,000,000,000)이 주어진다.
		 * 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
		 */
		
		//스캐너 선언
		Scanner sc=new Scanner(System.in);
		//변수 선언 및 초기화
		int a=0;
		//입력 받기
		a=sc.nextInt();
		
		int count = 1;  //최소 개수의 방
		int range = 2;  //n이 1일 때 빼고 나머지 방의 범위
		
		if(a==1) {
			System.out.println(1);
		}else {
			while(range<=a) { //n까지 도착해야하니까 범위가 n을 넘으면 안됨
				range=range+(6*count); //방의 개수 한겹에 6개씩 생성
				count++; //범위가 하나씩 커질 때 마다 방 개수 증가
			}
			System.out.println(count);
		}
		
		
		
		
	
		/*
		 * <문제> 
		 * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
		 * 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. 
		 * 이어서 N개의 줄에 행렬 C의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
		 * 첫째 줄부터 N개의 줄에 행렬 B와 C를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
		 */
		
		//변수입력받기
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		//행렬선언=> 2차원배열
		int[][] arr = new int[n][m];
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<n; j++) {
				for(int j2=0; j2<m; j2++) {
					
					arr[j][j2] +=sc.nextInt();
				}
			}
		}
		
		
		//행렬 출력
		for(int i=0; i<n; i++) {
			for(int i2=0; i2<m; i2++) {
				System.out.print(arr[i][i2]+" ");
				
			}
			System.out.println();
		}
		
		
	}

}
