package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main61 {

	public static void main(String[] args) {

		/*
		 * <문제>
		 * 어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.
		 * A+: 4.3, A0: 4.0, A-: 3.7
		 * B+: 3.3, B0: 3.0, B-: 2.7
		 * C+: 2.3, C0: 2.0, C-: 1.7
		 * D+: 1.3, D0: 1.0, D-: 0.7
		 * F: 0.0
		 * 첫째 줄에 C언어 성적이 주어진다. 성적은 문제에서 설명한 13가지 중 하나이다. 
		 * 첫째 줄에 C언어 평점을 출력한다.
		 */
		
		//Map 사용해서 풀어보기
		Map<String, Double> score = new HashMap<String, Double>(); //Map<key, value>
		
		score.put("A+", 4.3); //Map 안에 값 넣기=> Map.put(key,value)
		score.put("A0", 4.0);
		score.put("A-", 3.7);
		score.put("B+", 3.3);
		score.put("B0", 3.0);
		score.put("B-", 2.7);
		score.put("C+", 2.3);
		score.put("C0", 2.0);
		score.put("C-", 1.7);
		score.put("D+", 1.3);
		score.put("D0", 1.0);
		score.put("D-", 0.7);
		score.put("F", 0.0);
		
		Scanner sc = new Scanner(System.in); //스캐너 선언
		String grade= sc.next(); //성적 입력

		System.out.println(score.get(grade)); //Map 안의 값 가져오기=>Map.get(key)
	}

}
