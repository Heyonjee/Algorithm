package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main39 {

	public static void main(String[] args) {

		
		/*
		 * <문제>
		 * 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
		 * 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
		 * 첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
		 * 둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다.
		 * 나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.
		 * 첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //회원수
		String[][] arr= new String[n][2]; //배열선언 => 나이,이름 
		
		for(int i=0; i<n; i++) {
			arr[i][0] = sc.next(); //나이
			arr[i][1] = sc.next(); //이름
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			
			@Override  //메서드 변경(재정의)
			public int compare(String[] a1, String[] a2) {
				return Integer.parseInt(a1[0])-Integer.parseInt(a2[0]); //나이순으로 정렬, 나이가 같을 경우 자동적으로 입력 순으로 정렬
				
			}
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i][0]+ " " + arr[i][1]); //한줄에 나이 이름 출력
		}
		
	}

}
