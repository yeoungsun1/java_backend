package user;

import java.util.ArrayList;
import java.util.Scanner;

//2번 : 로그인 성공, 아이디/비밀번호 틀렸을때 확인하기
public class UserFailMain {
	public static void main(String[] args) {
		//User클래스의 객체를 만들고 ArrayList<User>에 회원 여러명 저장
		//사용자로부터 아이디와 비밀번호를 입력받기
		//로그인 성공/실패 여부를 구분해서 메시지 출력
		
/* 사용할 문법
 *  	Scanner 클래스 import
 * 		ArrayList<User> 객체 생성
 * 		객체명.add() 추가 메소드
 * 		입력객체.nextLine() 입력 메소드
 * 		boolean 타입의 변수(플래그)
 * 		for-each문 반복문
 * 		if~else문 조건문
 * 		.equals() 문자열 비교
 * 		각 분기마다 출력 메소드
 * */
		
		Scanner sc = new Scanner(System.in);
		
		//회원목록 만들기
		ArrayList<User> users = new ArrayList<>();
		
		//User 클래스의 객체 user1, user2 생성
		User user1 = new User("짱구", 5, "gu", "1234");
		System.out.println(user1);
		User user2 = new User("철수", 5, "su", "abc");
		System.out.println(user2);
		
		//user1, user2 객체를 users 리스트에 추가
		System.out.println(users); //[]
		users.add(user1);
		System.out.println(users); //[User [name=짱구, age=5, id=gu, pw=1234]]
		users.add(user2);
		System.out.println(users); //[User [name=짱구, age=5, id=gu, pw=1234], User [name=철수, age=5, id=su, pw=abc]]
		
		//사용자 입력
		System.out.println("아이디 입력 : ");
		String inputId = sc.nextLine();
		System.out.println("비밀번호 입력 : ");
		String inputPw = sc.nextLine();
		System.out.println("입력한 아이디는 " + inputId + "이고, 입력한 비밀번호는 " + inputPw + "입니다.");
		
		//아이디가 틀린경우 => 존재하지 않는 아이디입니다
		//아이디는 맞지만 비밀번호가 틀린경우 => 비밀번호가 틀렸습니다
		//로그인 성공한경우 => 로그인 성공!! 000님 환영합니다!!
		
	}
}
