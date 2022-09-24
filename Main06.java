package test;

public class Main06 {

	
		
		//정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
		long sum(int[] a) {
			long sum=0;
			
			for(int i = 0; i<a.length; i++) {
				sum=sum+a[i]; //sum += a[i];
			}
			return sum; //리턴되는 타입은 long
		}
		

		
		
		
		/*
		 * 셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자.
		 * 예를 들어, d(75) = 75+7+5 = 87이다. 양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다.
		 * 예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51+ 5 + 1 = 57이다.
		 * 이런식으로 다음과 같은 수열을 만들 수 있다. n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다.
		 * 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다.
		 * 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		 */
		public static int d(int num) {
			int sum = num;
			
			while(num !=0) {
				sum=sum+(num%10); 
				num=num/10;
				
			}
			return sum;
		}
		
		public static void main(String[] args) {
			boolean[] check = new boolean[10001]; //인덱스는 0부터 시작이므로
			
			for(int i=1; i<=10000; i++) {
				int n =d(i);
				
				if(n<10001) {
					check[n] =true; //리턴되는 값들은 생성자가 있는 수들이기 때문에 true로 처리하여 출력x
				}
			}
			
			for(int i=1; i<=10000; i++) { 
				if(!check[i]) { //나머지 숫자들 = 셀프넘버
					System.out.println(i);
				}
			}
		}
}
