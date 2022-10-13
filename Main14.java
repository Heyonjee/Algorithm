package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
			
			
			
			/*
			 * <문제>
			 * 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다.
			 * 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
			 * 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
			 * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
			 * 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
			 * 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
			 */
			
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			double[] arr2= new double[n];
			double m=0; // 최고점
			double sum=0;
			double score=0; //받은 시험점수
			
			
			for(int i=0; i<n; i++) {
				score=Double.parseDouble(st.nextToken()); //평균은 소수점 나오니까
			
				arr2[i]=score;
				if(score>m) {
					m=score;
				}
			}
				for(int i=0; i<n; i++) {
					double newscore=arr2[i]/m*100; //조작한 점수
					arr2[i]=newscore;
					sum += (double)(arr2[i]);
				}
				
				System.out.println(sum/n);
			}
			
			
		}


