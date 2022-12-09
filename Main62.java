package test;

import java.util.Scanner;

public class Main62 {

	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in);
		
		
		while(true) {
			int a=sc.nextInt(); //두 수 입력
			int b=sc.nextInt();
			
			if(a==0&&b==0) {
				break;
			
			}else if(a>b) {                //이런 풀이도 가능=> String str=a>b? "Yes":"No";
				System.out.println("Yes"); //               System.out.println(str);                 
				
			}else {
				System.out.println("No");
			}
		}
		
	
		
	}

}
