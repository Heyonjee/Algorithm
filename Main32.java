package test;

import java.util.Scanner;

public class Main32 {

	public static void main(String[] args) {
		
		/*
		 * <문제>
		 * 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때,
		 * 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
		 * 첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다. 주어지는 수는 100보다 작은 자연수 또는 0이다.
		 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다.
		 * 최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.
		 */
		Scanner sc=new Scanner(System.in);
		
		int[][] arr= new int[9][9]; //배열 선언
		
		int max=-1; //최댓값 => 입력받은 모든 수가 0일 경우를 위해서 -1로 선언!! 만약 max=0으로 선언한다면 0행 0열로 출력됌.
		int x=0; //행
		int y=0; //열
		
		for(int i=0; i<9; i++) {  //배열에 숫자 담기
			
			for(int j=0; j<9; j++) {
				
				arr[i][j]=sc.nextInt(); //스캐너로 입력받기
					
					if(arr[i][j]>max) { //최대값 변수에 담아서 비교
						max=arr[i][j];
						x=i+1;
						y=j+1;
				}
			}
		}
		System.out.println(max);
		System.out.print(x+" "+y);
		
	}

}
