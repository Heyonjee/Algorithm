package test;

import java.util.Scanner;

public class Main70 {

	public static void main(String[] args) {

		
		
		
		
		/*
		 * <문제>
		 * A pyramid of blocks is constructed by first building a base layer of n blocks and then adding n-1 blocks to the next layer.
		 * This process is repeated until the top layer only has one block. 
		 * You must calculate the number of blocks needed to construct a pyramid given the size of the base.
		 * For example, a pyramid that has a base of size 4 will need a total of 10 blocks.
		 * The input will be a sequence of integers, one per line.
		 * The end of input will be signaled by the integer 0, and does not represent the base of a pyramid.
		 * All integers, other than the last (zero), are positive.
		 * For each positive integer print the total number of blocks needed to build the pyramid with the specified base.
		 */
		Scanner sc = new Scanner(System.in); //스캐너 선언
		
		while(true) { //반복문
			int n=sc.nextInt(); //피라미드 base 개수(맨 아래층)
			
			if(n==0) { //base가 0일 경우 중지
				break;
			
			}else{
				int total=n*(n+1)/2;  //등차가 1인 경우 등차수열의 합=n*(n+1)/2 => 항 개수*(첫 항+마지막 항)/2
				System.out.println(total);
			}
			
		}
	}

}
