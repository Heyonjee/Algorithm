package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main66 {

	public static void main(String[] args) throws IOException {

		
		/*
		 * <문제> 
		 * JOI군은 카드 게임을 하고 있다. 이 카드 게임은 5회의 게임으로 진행되며, 그 총점으로 승부를 하는 게임이다.
		 * JOI군의 각 게임의 득점을 나타내는 정수가 주어졌을 때, JOI군의 총점을 구하는 프로그램을 작성하라.
		 * 표준 입력에서 다음과 같은 데이터를 읽어온다.
		 * i 번째 줄(1 ≤ i ≤ 5)에는 정수 Ai가 적혀있다. 이것은 i번째 게임에서의 JOI군의 점수를 나타낸다.
		 * 표준 출력에 JOI군의 총점을 한 줄로 출력하라.
		 */
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int sum=0; //총점
		for(int i=1; i<=5; i++) { //총 5회
			sum=sum+Integer.parseInt(br.readLine()); //int형으로 형변환
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		/*
		 * <문제>
		 * 서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
		 * 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
		 */
		SimpleDateFormat day=new SimpleDateFormat("yyyy-MM-dd"); //날짜데이터 형식변환
		
		Date today=new Date(); //날짜변수 선언
		System.out.println(day.format(today)); //변환된 형식에 날짜값 담기
		
	}

}
