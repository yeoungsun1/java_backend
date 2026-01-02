package input;

import java.util.Scanner;

//2번 : 입력 클래스와 입력 메소드(.next())
public class InputTest01 { // 클래스 시작영역 중괄호
	public static void main(String[] args) { //main메소드 시작영역 중괄호
		
		//입력 메소드를 사용하기 위해서는 반드시 한줄이 필요하다
		Scanner sc = new Scanner(System.in);
		//자동 import 단축키 : ctrl + shift + o
		System.out.print("자바웹 백엔드 며칠차인지 작성하세요 : ");
		String day = sc.next();
		System.out.print("지금 배우고 있는 메소드를 작성하세요 : ");
		String inputMethod = sc.next();
		
		System.out.println(day + "입니다");
		System.out.println(inputMethod +"를 배우고 있습니다");
		System.out.println("안녕");
		
		
	}//main 메소드 끝영역 중괄호
} //클래스 끝 영역 중괄호
