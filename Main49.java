package test;

import java.util.Scanner;

public class Main49 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 한수는 지금 (x, y)에 있다.
		 * 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
		 * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 x, y, w, h가 주어진다.
		 * 첫째 줄에 문제의 정답을 출력한다.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		sc.close();
		
		int x_min=Math.min(x, w-x); // 직사각형 탈출방법 : x, y, w-x, h-y 
		int y_min=Math.min(y, h-y); 
		
		System.out.println(Math.min(x_min, y_min)); //탈출 방법 중 최소값 출력
		
	}

}
