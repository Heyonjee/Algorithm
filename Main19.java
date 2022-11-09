package test;

import java.util.Scanner;

public class Main19 {

	public static void main(String[] args) {
		
		/*
		 * <문제>
		 * 
		 *  1/1 | 1/2 | 1/3 | 1/4 | 1/5 | ...
			2/1	| 2/2 |	2/3 | 2/4 | ... | ...
			3/1 | 3/2 |	3/3 | ... | ... | ...
	  	    4/1	| 4/2 | ... | ... | ... | ...
			5/1 | ... | ... | ... | ... | ...
		 * 
		 * 이와 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
		 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
		 * 첫째 줄에 분수를 출력한다. 
		 */		
		Scanner sc = new Scanner(System.in); //스캐너 선언
		
		int x=sc.nextInt(); //숫자 입력
		
		int cross_count=1; //대각선 블럭 개수
		
		int sum=0; //직전 대각선까지 누적된 블럭의 개수
		
		while(true) {
		
			if(x<=sum+cross_count) { //cross_count가 홀수: 대각선 아래에서 위로, cross_count가 짝수: 대각선 위에서 아래로
			
			if(cross_count%2==1) { //cross_count가 홀수 => 분자가 큰 수부터 시작
				
				
				/* 분자: 해당 대각선 내의 블럭 개수-(x-직전 대각선까지의 블럭 개수-1)
				   분모: x-직전 대각선까지의 블럭 개수 */
				System.out.print((cross_count-(x-sum-1))+"/"+(x-sum));
				
				break;
				
			}else { //cross_count가 짝수 => 분자가 작은 수부터 시작
				
				/* 분자: x-직전 대각선까지의 블럭 개수
				   분모: 해당 대각선 내의 블럭 개수-(x-직전 대각선까지의 블럭 갯-1) */
				System.out.print((x-sum)+"/"+(cross_count-(x-sum-1)));
				
				break;
			}
				
		}else {
				
			sum+=cross_count;
			cross_count++;
			
		}
		
	  }
		
   }
}


