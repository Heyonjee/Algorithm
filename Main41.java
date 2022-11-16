package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main41 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다.
		 * 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다.
		 * 둘째 줄에는 N의 진짜 약수가 주어진다.
		 * 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.
		 * 첫째 줄에 N을 출력한다. N은 항상 32비트 부호있는 정수로 표현할 수 있다.
		 */
		
		Scanner sc= new Scanner(System.in);
		
		int t=sc.nextInt(); //진짜 약수의 개수
		int[] arr = new int[t];
		
		//N은 처음 입력된 약수(최소값)*마지막 입력된 약수(최대값)
		for(int i=0; i<t; i++) {
			
			arr[i]=sc.nextInt(); //약수 입력
		}
		Arrays.sort(arr); //오름차순 정렬(최소~최대)
		
		int min=arr[0]; //최소값
		int max=arr[t-1]; //최대값 =>배열은 0부터 시작하니까
		
		System.out.println(min*max);
		}
		
	}


