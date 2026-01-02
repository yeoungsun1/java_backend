package input;

import java.util.Scanner;

// 4일차 1번 : 입력메소드 연습
public class InputTest04 {
	public static void main(String[] args) {
		//사용자로부터 입력받아서 값 출력하기
		
		Scanner sc = new Scanner(System.in);
		//입력받을 땐 반드시 Scanner 클래스가 있어야한다
		//자동 import 단축키 : ctrl + shift + o
		
		//입력메소드 : next(), nextLine(), nextInt(), nextDouble()
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine(); //문자열로 입력받은 값을 문자열 name 변수에 저장
		System.out.println("입력한 이름은 " + name + "입니다.");
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt(); //정수형으로 입력받은 값을 정수형 age 변수에 저장
		System.out.println("나이는 " + age + "살 입니다.");
		System.out.println("나이는 " + age+1 + "살 입니다."); 
		//age+1 앞에 문자열이 있으므로 모두 연결되어 출력된다
		System.out.println(age+1 + "살 입니다.");
		//age+1 제일 먼저 있으므로 숫자덧셈연산이 되고 뒤에 문자열이 연결되어 출력된다
		System.out.println("나이는 " + (age+1) + "살 입니다.");
		//문자열 + 숫자연산 + 문자열 형태일 경우
		//문자열 연결이 아닌 숫자 연산된 값으로 제대로 출력되도록 ()를 연산할 부분에 사용한다
		
		sc.nextLine(); //버퍼 비우기(엔터를 소모한다)
		
		System.out.println("아이디 입력 : ");
		String id = sc.nextLine(); //버퍼비우기를 하지 않아 입력받지 않는다
		System.out.println("아이디는 \"" + id + "\"입니다.");
		
		System.out.println("비밀번호 입력 : ");
		String pw = sc.nextLine();
		System.out.println("비밀번호는 " + pw + "입니다.");
		
		sc.close(); //입력 클래스를 사용하고 마지막에는 반드시 close()메소드로 닫아줘야한다!!
	}
}
