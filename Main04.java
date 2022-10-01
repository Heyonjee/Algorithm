package test;

import java.math.BigInteger;
import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 사파리월드는 인터넷으로만 존재하는 미스테리한 나라이다. 사파리월드에는 2개의 서브도메인이 seunghwan.royal.gov.sw와
		 * kyuhyun.royal.gov.sw 이 있는데, 이것이 couple.royal.gov.sw으로 합쳐질 것이다. 그러나 도메인 관리 센터
		 * SWNIC(센터장: 김동규)에는 엄격한 룰이 있다. 두 서브도메인을 합칠 때, 유명도의 차이가 너무 차이나지 않을 경우에만 두 서브도메인을
		 * 결혼시키는 것이다. 서브도메인의 유명도는 정수이다. 두 서브도메인의 유명도가 주어졌을 때, 그 차이를 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 두 유명도의 차이 (|a-b|)을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger a=sc.nextBigInteger();
		BigInteger b=sc.nextBigInteger();
		BigInteger result = a.subtract(b);
		
		
		
		System.out.println(result.abs());
		
	
	
		
		
		
		/*
		 * <문제>
		 * 갑부 최백준 조교는 동전을 최소로 바꾸는데 성공했으나 김재홍 조교가 그 돈을 발견해서 최백준 조교에게 그 돈을 나누자고 따진다. 그 사실이
		 * 전 우주로 알려지자 우주에 있던 많은 생명체들이 자신들에게 돈을 분배해 달라고 당장 달려오기 시작했다. 프로토스 중앙 우주 정부의 정책인,
		 * ‘모든 지적 생명체는 동등하다’라는 규칙에 입각해서 돈을 똑같이 분배하고자 한다. 한 생명체에게 얼마씩 돈을 줄 수 있는가? 또,
		 * 생명체들에게 동일하게 분배한 후 남는 돈은 얼마인가?
		 * 첫째 줄에는 최백준 조교가 가진 돈 n과 돈을 받으러 온 생명체의 수 m이 주어진다. (1 ≤ m ≤ n ≤ 101000, m과 n은 10진수 정수)
		 */
		
		
		BigInteger n=sc.nextBigInteger();
		BigInteger m=sc.nextBigInteger();
		
		
	
		
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
		
		
		
		/*
		 * <문제>
		 * 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
		 * 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리수를 이어 붙이면 새로운 수를 만들 수 있다.
		 * 예) 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
		 * 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
		 * x가 주어졌을 때, x의 사이클의 길이를 구하는 프로그램을 작성하시오.
		 */
		
		int x=0;
		
		x=sc.nextInt();
		
		sc.close();
		
		int copy = x; // 처음 입력값과 비교하기 위해서
		int count = 0; //사이클 횟수
		
		while(true) {  //반복을 위해서
			x = ((x%10)*10) + (((x/10)+(x%10))%10); //십의 자리수+일의 자리수
			count++;
			
			if(copy==x) { //처음 입력값과 같게 되면 반복문 빠져나오기
				break;
			}
			
		}
		System.out.println(count);
		
		
		
	}

}
