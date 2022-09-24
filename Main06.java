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
		

}
