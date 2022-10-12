package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14 {

	public static void main(String[] args) throws IOException {

		/*
		 * <문제>
		 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
		 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
		 * 입력 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다.
		 * 문자열은 O와 X만으로 이루어져 있을 때, 각 테스트 케이스마다 점수를 출력한다.
		 */
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //bufferedreader 선언
		
			StringBuilder sb = new StringBuilder();//문자열 이어주기
			int t =Integer.parseInt(br.readLine());//자료형 변환
			
			String arr[] =new String[t]; //배열선언
			
			for(int i=0; i<t; i++) {
				arr[i] =br.readLine(); //한줄 단위로 데이터 받기
			}
			
			for(int i=0; i<t; i++) {
				int cnt=0; //연속횟수
				int sum=0; //누적합산
				
				for(int j=0; j<arr[i].length(); j++) {
					if(arr[i].charAt(j)=='O') {  //charAt() 메소드: 문자열 하나하나 검사
						cnt++;
					}else {
						cnt=0;
					}
					sum+=cnt;
					
				}
				sb.append(sum).append('\n'); //stringbuilder로 문자열 이어주고 개행해줌!
			}
			System.out.print(sb);
			
	}

}
