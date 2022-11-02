package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main25 {

	public static void main(String[] args) {

		
		/*
		 * <문제> 
		 * 2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에 N명의 학생들이 응시했다.
		 * 이들 중 점수가 가장 높은 k명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.
		 * 커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다. 첫째 줄에는 응시자의 수 N과 상을 받는 사람의 수 k가 공백을 사이에 두고 주어진다.
		 * 둘째 줄에는 각 학생의 점수 x가 공백을 사이에 두고 주어진다. 상을 받는 커트라인을 출력하라.
		 * 1 ≤ N ≤ 1000
		 * 1 ≤ k ≤ N
		 * 0 ≤ x ≤ 10000
		 */
		Scanner sc = new Scanner(System.in); //스캐너 선언
		
		int n=sc.nextInt(); //응시인원
		
		int k=sc.nextInt(); //수상인원
		
		Integer[] arr= new Integer[n]; //응시생 점수
		
		//방법1 : 오름차순 정렬
		/* for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr); //배열정렬
		
		System.out.println(arr[n-k]); //배열은 0부터 시작이니까
		*/
		
		//방법2 : 내림차순 정렬 => 배열 Integer로 선언해야 Collerctions.reverseOrder()를 사용할 수 있다!
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder()); 
		
		System.out.println(arr[k-1]); //배열은 0부터 시작이니까
		
		
	}

}
