package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main44 {

	public static void main(String[] args) throws IOException {

		
		/*
		 * <문제> 
		 * N개의 정수가 주어지면, 이 정수들의 합 S의 부호를 구하는 프로그램을 작성하시오. 
		 * 총 3개의 테스트 셋이 주어진다. 각 테스트 셋의 첫째 줄에는 N(1 ≤ N ≤ 100,000)이 주어지고, 둘째 줄부터 N개의 줄에 걸쳐 각 정수가 주어진다.
		 * 주어지는 정수의 절댓값은 9223372036854775807보다 작거나 같다.
		 * 총 3개의 줄에 걸쳐 각 테스트 셋에 대해 N개의 정수들의 합 S의 부호를 출력한다.
		 * S=0이면 "0"을, S>0이면 "+"를, S<0이면 "-"를 출력하면 된다.
		 */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<3; i++) { //숫자가 커서 BigInteger에 담아야함
			
			BigInteger s = new BigInteger("0"); //정수들의 합
			
			int n = Integer.parseInt(br.readLine()); //BigInteger는 형변환을 반드시 해줘야함
			
			for(int j=0; j<n; j++) {
				BigInteger num = new BigInteger(br.readLine());
				s=s.add(num); //BigInteger는 별도의 사칙연산 함수 사용
			}
			
			//compareTo() : 기준값.compareTo(비교값)
			// 기준값=비교값--->0을 반환
			// 기준값>비교값--->1을 반환
			// 기준값<비교값--->-1을 반환
			if(s.compareTo(new BigInteger("0"))==-1) {
				System.out.println("-");
			}else if(s.compareTo(new BigInteger("0"))==1) {
				System.out.println("+");
			}else {
				System.out.println(0);
			}
		}
	}

}
