package test;

import java.util.Scanner;

public class Main21 {

	public static void main(String[] args) {

		
		
		/*
		 * <문제>
		 * 두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
		 * 입력은 여러 테스트 케이스로 이루어져 있다.
		 * 각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다.
		 * 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.
		 * 각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를
		 * 출력한다.
		 */

		int num1, num2=0;  //변수 선언
		
		Scanner sc = new Scanner(System.in);  //스캐너 기능선언
		
		
		while(true) {
			
		num1=sc.nextInt();
		num2=sc.nextInt();
			
			// 마지막 두 수가 0, 0인 if문이 맨 위에 와야함! => 다른 곳에 위치하면 NZEC(Non Zero Exit Code) 정상종료 되지 않았다는 런타임에러가 남.
			if(num1==0 && num2==0){ //마지막 두 수는 0, 0
				break;
			}
		
			if(num2%num1 == 0) { //첫번째 숫자가 두번째 숫자의 약수
				System.out.println("factor");
			
			}else if(num1%num2==0) { //첫번째 숫자가 두번째 숫자의 배수
				System.out.println("multiple");
				
				
			}else { //둘 다 아닐 때
				System.out.println("neither");
			
			} 			
				
			}
		
		}
		
	}
			
		



