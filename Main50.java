package test;

import java.util.Scanner;

public class Main50 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 동호는 새악대로 T 통신사의 새 핸드폰 옴머나를 샀다.
		 * 새악대로 T 통신사는 동호에게 다음 두 가지 요금제 중 하나를 선택하라고 했다.
		 * 영식 요금제 민식 요금제 영식 요금제는 30초마다 10원씩 청구된다.
		 * 이 말은 만약 29초 또는 그 보다 적은 시간 통화를 했으면 10원이 청구된다. 만약 30초부터 59초 사이로 통화를 했으면 20원이 청구된다.
		 * 민식 요금제는 60초마다 15원씩 청구된다.
		 * 이 말은 만약 59초 또는 그 보다 적은 시간 통화를 했으면 15원이 청구된다. 만약 60초부터 119초 사이로 통화를 했으면 30원이 청구된다.
		 * 동호가 저번 달에 새악대로 T 통신사를 이용할 때 통화 시간 목록이 주어지면 어느 요금제를 사용 하는 것이 저렴한지 출력하는 프로그램을 작성하시오.
		 * 동호가 저번 달에 이용한 통화의 개수 N이 주어진다. N은 20보다 작거나 같은 자연수이다. 둘째 줄에 통화 시간 N개가 주어진다.
		 * 통화 시간은 10,000보다 작거나 같은 자연수이다.
		 * 첫째 줄에 싼 요금제의 이름을 출력한다. 그 후에 공백을 사이에 두고 요금이 몇 원 나오는지 출력한다.
		 * 만약 두 요금제의 요금이 모두 같으면 영식을 먼저 쓰고 민식을 그 다음에 쓴다.
		 * 영식은 Y로, 민식은 M으로 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 저번 달에 이용한 통화의 개수
		int t = 0; // 통화 시간
		int price_Y = 0; // 영식요금제 금액
		int price_M = 0; // 민식요금제 금액
		
		for(int i=1; i<=n; i++) { //지난 달 통화 개수만큼 반복
			
			t = sc.nextInt(); //통화시간 입력
			
			price_Y += ((t/30)+1)*10;
			price_M += ((t/60)+1)*15;
		}
		
		if(price_Y == price_M) { //영식요금제와 민식요금제 금액이 같을 경우
			System.out.println("Y M "+ price_Y); //Y부터 출력
		
		}else if(price_Y > price_M) { //두 요금제 금액이 다를 경우 싼 요금제 출력
			System.out.println("M "+price_M);  
		
		}else if(price_Y < price_M) {
			System.out.println("Y "+price_Y);
		}
	}

}
