package test;

import java.util.Scanner;


public class Main56 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * A group of N persons and the ACM Chief Judge share equally a number of S shares (not necessary all of them).
		 * Let x be the number of shares acquired by each person (x must be an integer).
		 * The problem is to compute the maximum value of x.
		 * Write a program that reads pairs of integer numbers from an input text file.
		 * Each pair contains the values of 1 ≤ N ≤ 10000 and 1 ≤ S ≤ 109 in that order.
		 * The input data are separated freely by white spaces, are correct, and terminate with an end of file.
		 * For each pair of numbers the program computes the maximum value of x and prints that value on the standard output from the beginning of a line
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//hasNext(): Boolean타입 반환 즉, 다음에 가져올 값이 있으면 true, 없으면 false 반환
		while(sc.hasNext()) { //while의 조건이 true가 아닌 hasNext()인 이유: EOF일때 끝내기 위해, 만약 true면 무한 반복... => EOF=Ctrl+Z
			int n= sc.nextInt(); //그룹의 사람 수
			int s= sc.nextInt(); //주식 수
			
			System.out.println(s/(n+1)); // 총 사람 수는 n+judge=n+1
		}
		
	}

}
