package test;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {

		
		
		// Hello World!를 출력하시오.
		
		System.out.println("Hello World!");	
		
		
		
		
		
		//Welcome을 예제 출력처럼 출력하는 프로그램을 작성하시오.
				
		System.out.println(".  .   .");
		System.out.println("|  | _ | _. _ ._ _  _");
		System.out.println("|/\\|(/.|(_.(_)[ | )(/.");
		
		
		
		
		
		/*
		 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를
		 * 출력하는 프로그램을 작성하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
				
		  
		
				
		/*
		 * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오. 
		 * 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		 */
		
		int a = sc.nextInt();
		if(a%4==0) {
			if(a%400==0) {
				System.out.println(1);
				
			}else if(a%100==0) {
				System.out.println(0);
				
			}else {
				System.out.println(1);
			}
		}else
			System.out.println(0);
		
		
		
		
		/*
		 * 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다.
		 * "Quadrant n"은 "제n사분면"이라는 뜻이다. 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
		 * 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
		 */
		
		int x, y =0;
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>0) {
			if(y>0) {
				System.out.println(1);
			}else {
				System.out.println(4);
			}
		}else {
			if(y<0) {
				System.out.println(3);
			}else {
				System.out.println(2);
			}
		}
		
		
		/*
		 * "45분 일찍 알람 설정하기"이다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 
		 * 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 설정한 놓은 알람 시간 H시 M분을 의미한다. 
		 * 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
		 * 45분 일찍 알람 설정하기 방법을 사용할때 설정해야 하는 알람 시간을 출력한다.
		 */
		
		int h, m =0;
		h = sc.nextInt();
		m = sc.nextInt();
		
		
		if(m>=45) {
			
			if(h==0) {
				h=23;
			}
			System.out.println(h +" "+ (m-45));
			
		}else {
			System.out.println((h-1)+" "+(m+15));
			
		}
		
		
		
		
	}

}
