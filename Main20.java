package test;

import java.util.Scanner;

public class Main20 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
		 * 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
		 * 예를 들어 흰색 도화지 위에 세 장의 검은색 색종이를 그림과 같은 모양으로 붙였다면 검은색 영역의 넓이는 260이 된다.
		 * 첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다.
		 * 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다.
		 * 색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다.
		 * 첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.
		 */
		
		
		Scanner sc= new Scanner(System.in); //스캐너 선언

		int[][] arr = new int[100][100];  //2차원배열 선언 =>도화지 가로,세로
		
		int t=sc.nextInt();  //색종이 개수
		
		int count=0; //색종이 면적 1의 개수세기
		
		for(int i=0; i<t; i++) {
			int x = sc.nextInt();  // (x,y) => 색종이의 시작점
			int y = sc.nextInt();
			
			for(int a=x; a<x+10; a++) {
				for(int b=y; b<y+10; b++) {
					arr[a][b]=1;    // 색종이의 좌표 1개의 면적을 1로 표현  => 1의 개수가 총 넓이
				}
			}
				
		}
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				
				if(arr[i][j]==1) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		}
		
	}

