package test;

import java.math.BigInteger;
import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {

		
		
		/*
		 * <문제> 
		 * Hello World!를 출력하시오.
		 */
		
		System.out.println("Hello World!");	
		
		
		
		
		/*
		 * <문제> 
		 * Welcome을 예제 출력처럼 출력하는 프로그램을 작성하시오.
		 */
				
		System.out.println(".  .   .");
		System.out.println("|  | _ | _. _ ._ _  _");
		System.out.println("|/\\|(/.|(_.(_)[ | )(/.");
		
		
		
		
		
		/*
		 * <문제>
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
		 * <문제>
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
		 * <문제>
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
		 * <문제>
		 * "45분 일찍 알람 설정하기"이다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 
		 * 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 설정한 놓은 알람 시간 H시 M분을 의미한다. 
		 * 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
		 * 45분 일찍 알람 설정하기 방법을 사용할때 설정해야 하는 알람 시간을 출력한다.
		 */
		
		int h, m =0;
		h = sc.nextInt();
		m = sc.nextInt();
		
		
		if(m>=45) {
			System.out.println(h+" "+(m-45));
		}else {
			if(h==0) {
				h=23;
			}else{
				h=h-1;
			}
			System.out.println(h+" "+(m+15));
			
		}
		
		
		
		
		
		/*
		 * <문제>
		 * 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다. 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
		 * 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
		 */
		int th, tm , t= 0;
		th = sc.nextInt();
		tm = sc.nextInt();
		t = sc.nextInt();
		
		int min = 60*th+tm;
		min += t;
		
		int hour = (min/60)%24;
		int minute= min%60;
		
		System.out.println(hour+" "+minute);
	
		
		
		

		/* 
		 * <문제>
		 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
		 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
		 * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
		 * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
		 * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		 */
		
		int d1, d2, d3 = 0;
		
		
		d1 = sc.nextInt();
		d2 = sc.nextInt();
		d3 = sc.nextInt();
		
		if(d1!=d2 && d2!=d3 && d1!=d3) {
			int max;
			if(d1>d2) {
				if(d3>d1) {
					max=d3;
				}else {
					max=d1;
				}
			}else {
				if(d3>d2) {
					max=d3;
				}else {
					max=d2;
				}
			}
			System.out.println(max*100);
			
		}else {
			if(d1==d2 && d2==d3) {
				System.out.println(10000+d1*1000);
			}else {
				if(d1==d2 || d1==d3) {
					System.out.println(1000+d1*100);
				}else {
					System.out.println(1000+d2*100);
				}
			}
		}
		
		
		
		
		/*
		 * <문제>
		 * 영수증에 적힌 구매한 각 물건의 가격과 개수, 구매한 물건들의 총 금액을 보고 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
		 * 첫째 줄에는 영수증에 적힌 총 금액 total이 주어진다.
		 * 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
		 * 이후 N개의 줄에는 각 물건의 가격 p와 개수 c가 공백을 사이에 두고 주어진다.
		 * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
		 */
		int total=0;
		int n, p, c =0;
		total=sc.nextInt();
		n=sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			p=sc.nextInt();
			c=sc.nextInt();
			
			total=total-(p*c);
		}
			if(total==0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
			
			
			
			/*
			 * <문제>
			 * 두 정수 num1과 num2를 입력받은 다음, num1+num2를 출력하는 프로그램을 작성하시오.
			 * 첫째 줄에 num1과 num2가 주어진다. (0 < num1, num2  < 1010000)
			 * 첫째 줄에 num1+num2를 출력한다.
			 */
			
			//스캐너 선언
			
			//biginteger로 큰 정수 받기 => biginteger는 문자열을 반환함
			BigInteger num1 = sc.nextBigInteger();
			BigInteger num2 = sc.nextBigInteger();
			
			System.out.println(num1.add(num2));
			
			
		}
	
	}


