package test;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		
		//아래 예제와 같이 고양이를 출력하시오.
		
		//방법 1
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");

		//방법 2 => 출력속도 더 빠름
		System.out.println("\\    /\\\n" + " )  ( ')\n" + "(  /  )\n" + " \\(__)|");
		
		
		
		//아래 예제와 같이 개를 출력하시오.
		System.out.println("|\\_/|\n" + "|q p|   /}\n" + "( 0 )\"\"\"\\\n" + "|\"^\"`    |\n" + "||_/=\\\\__|");
		
		
		//아래 예제와 같이 새싹을 출력하시오.
		System.out.println("         ,r'\"7\n" + "r`-_   ,'  ,/\n" + " \\. \". L_r'\n" 
		+ "   `~\\/\n" + "      |\n" + "      |");
		
		
		/*
		 * 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다. 
		 * 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		String id = null;
		id = sc.next();
		
		System.out.println(id+"??!");
		
		
		
		
		
		/*
		 * ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다. 공항의
		 * 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다. 불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로
		 * 연도를 세는 불기를 사용한다. 반면, 우리나라는 서기 연도를 사용하고 있다. 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을
		 * 작성하시오.
		 */
		
		int a=0;
		a = sc.nextInt();

		System.out.println(a-543);
		
		
		
		
		/*(세 자리 수) × (세 자리 수) 과정 출력하기
		 *  (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		 
		     4 7 2   ....(1)
		   x 3 8 5   ....(2)
         -----------
           2 3 6 0   ....(3)
         3 7 7 6     ....(4)
       1 4 1 6       ....(5)
     ---------------
       1 8 1 7 2 0   ....(6)  */
   
		
		int b,c =0;
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		
		System.out.println(b*(c%10)+"\n"+b*((c/10)%10)+"\n"+b*(c/100));
		System.out.println(b*c);
		
		
		
		
		
		
		/*
		 * (d+e)%f는 ((d%e) + (e%f))%f 와 같을까? (d×e)%f는 ((d%f) × (e%f))%f 와 같을까?
		 * 세 수 d, e, f가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		 */
		
		int d, e, f = 0;
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
		
		
		
		System.out.println((d+e)%f+"\n"+((d%f) + (e%f))%f+"\n"+(d*e)%f+"\n"+((d%f)*(e%f))%f );
		
		
		
		
		
		
		/*
		 * 동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다. 체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다.
		 * 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
		 * 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다. 
		 * 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
		 */
		
		int king = sc.nextInt();
		int queen = sc.nextInt();
		int rook = sc.nextInt();
		int bishop = sc.nextInt();
		int knight = sc.nextInt();
		int pawn = sc.nextInt();
		
		int result1 = 1-king;
		int result2 = 1-queen;
		int result3 = 2-rook;
		int result4 = 2-bishop;
		int result5 = 2-knight;
		int result6 = 8-pawn;
		
		sc.close();
		
		System.out.println(result1+" "+result2+" "+result3+" "+result4+" "+result5+" "+result6);
		
		
		
		
		
	}

}

