package test;

import java.math.BigInteger;
import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {

		
		/*
		 * 사파리월드는 인터넷으로만 존재하는 미스테리한 나라이다. 사파리월드에는 2개의 서브도메인이 seunghwan.royal.gov.sw와
		 * kyuhyun.royal.gov.sw 이 있는데, 이것이 couple.royal.gov.sw으로 합쳐질 것이다. 그러나 도메인 관리 센터
		 * SWNIC(센터장: 김동규)에는 엄격한 룰이 있다. 두 서브도메인을 합칠 때, 유명도의 차이가 너무 차이나지 않을 경우에만 두 서브도메인을
		 * 결혼시키는 것이다. 서브도메인의 유명도는 정수이다. 두 서브도메인의 유명도가 주어졌을 때, 그 차이를 구하는 프로그램을 작성하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger a=sc.nextBigInteger();
		BigInteger b=sc.nextBigInteger();
		BigInteger result = a.subtract(b);
		
		
		
		System.out.println(result.abs());
		
	
	
		
		
		
		/*
		 * 갑부 최백준 조교는 동전을 최소로 바꾸는데 성공했으나 김재홍 조교가 그 돈을 발견해서 최백준 조교에게 그 돈을 나누자고 따진다. 그 사실이
		 * 전 우주로 알려지자 우주에 있던 많은 생명체들이 자신들에게 돈을 분배해 달라고 당장 달려오기 시작했다. 프로토스 중앙 우주 정부의 정책인,
		 * ‘모든 지적 생명체는 동등하다’라는 규칙에 입각해서 돈을 똑같이 분배하고자 한다. 한 생명체에게 얼마씩 돈을 줄 수 있는가? 또,
		 * 생명체들에게 동일하게 분배한 후 남는 돈은 얼마인가?
		 * 첫째 줄에는 최백준 조교가 가진 돈 n과 돈을 받으러 온 생명체의 수 m이 주어진다. (1 ≤ m ≤ n ≤ 101000, m과 n은 10진수 정수)
		 */
		
		
		BigInteger n=sc.nextBigInteger();
		BigInteger m=sc.nextBigInteger();
		
		
		sc.close();
		
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
		
		
		
		
	}

}
