package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;



public class Main13 {

	public static void main(String[] args) throws IOException {

		
		/*
		 * <문제>
		 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		 * 첫째줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
		 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //bufferedreader 선언
		
		int[] arr=new int[9]; //배열선언
		for(int i=0; i<9; i++) {
			arr[i]=Integer.parseInt(br.readLine()); //줄 단위로 데이터 받기
		}
		
		int max=0; //최대값 변수 초기화
		int count=0; //몇번째 숫자인지 세기 변수 초기화
		
		for(int i=0; i<9; i++) {
			
			
			if(arr[i]>max) {
				max=arr[i];
				count=i;
				
			}
		
		}
		System.out.println(max);
		System.out.println(count+1); //배열은 0번째 자리부터 시작이니까 +1을 해줘야함
		
		
		
		
		
		/*
		 *<문제>
		 *두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
		 *수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		 *입력 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
		 *첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
		 */
		
		//=>방법1 : 배열사용
		int[] arr2=new int[10]; //배열크기
		boolean bl; //n번째와 n+1번째랑 비교변수
		int cnt=0; //서로 다른 나머지 개수 측정변수
		
		for(int i=0; i<10; i++) { // 줄 단위로 데이터받기, 자료형 int 변환
			arr2[i]=Integer.parseInt(br.readLine())%42;
		}
		
		
		for(int i=0; i<10; i++) {
			bl=false; //기본값 false로 설정
			for(int j=i+1; j<10; j++) {
				if(arr2[i]==arr2[j]) { //n번째와 n+1번째 값 비교
					                     
					bl=true; //같을 때 
					break;
				}
			}if(bl==false) {
					cnt++; //다를 떄
				}
			}
		System.out.println(cnt);
		
		
		//=>방법2: HashSet 함수 사용-중복값 제거
		HashSet<Integer> hs = new HashSet<Integer>(); //자료형 선언
		for(int i=1; i<=10; i++) {
			hs.add(Integer.parseInt(br.readLine())%42); // 값을 HashSet에 저장
		}
		br.close();
		System.out.println(hs.size()); //HashSet의 크기=저장되어 있는 값 개수 출력
		
		}
		
		
	}


