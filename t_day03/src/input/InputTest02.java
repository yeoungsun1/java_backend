package input;

import java.util.Scanner;

//3번 : 입력메소드(회원가입)
public class InputTest02 {
	public static void main(String[] args) {
		//입력 클래스 import
		Scanner sc = new Scanner(System.in);
		
		//입력받은 값을 문자열로 돌려준다
		//next()와 nextLine() 메소드
		System.out.println(sc.toString());
		//이름, 아이디, 비밀번호, 나이까지 저장 후 출력
		System.out.println("이름 입력 : ");
		//문자열 변수 선언 후 입력받은 값을 대입(저장)
		String name = sc.next();
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("비밀번호 입력 : ");
		String pw = sc.next();
		System.out.println("나이 입력 : ");
		String age = sc.next();
		sc.nextLine();
		
		//전체 입력받은 값을 출력
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 아이디 : " + id 
				+ ",비밀번호 : " + pw);
		
		
		
	}
}
