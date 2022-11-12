package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main35 {

	public static void main(String[] args) throws IOException {

		
		/*
		 * <문제>
		 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
		 * 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
		 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
		 * 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); //공백으로 문자열 분리
				
		int a= Integer.parseInt(st.nextToken()); // 달팽이가 낮에 올라갈 수 있는 거리
		int b= Integer.parseInt(st.nextToken());// 달팽이가 밤에 미끄러지는 거리
		int v= Integer.parseInt(st.nextToken());// 나무막대 총 높이
		
		int day=(v-b)/(a-b); //밤에 미끄러지는 거리를 목적지에서도 동일하게 빼줌으로써 동등한 조건으로 만들어줌
		
		if((v-b)%(a-b) != 0) {  //나머지가 0이 아닐경우 하루가 더 필요함
			day++;
			
			System.out.println(day);
		
		}
		
	}
}

