package signup;

import java.util.Scanner;

// 2번 : 사용자 정보를 저장할 틀 만들기(User 클래스)
public class User {
	//User 클래스는 하나의 회원정보를 저장하는 틀(설계도면)
	
	//필드(특징, 속성) : 이름, 나이, 아이디, 비밀번호
	String name;	//문자열 자료형 이름 저장할 필드
	int age;		//정수형 자료형 나이 저장할 필드
	String id;		//문자열 자료형 아이디 저장할 필드
	String pw;		//문자열 자료형 비밀번호 저장할 필드
	
	//000님 환영합니다라는 문자열을 출력하는 기능
	//메소드
	//선언부 접근제한자 반환타입 메소드명() {
	//구현부 
    //     }

	public void printInfo() {
		System.out.println(this.name + "님 환영합니다!");
		//this : 객체 구별용 변수(this : 객체 자기자신을 나타냄)
	}
	
	//생성자 : User 객체가 만들어질 때 자동으로 실행된다
	//생성자 단축키 : alt + shift + s + o
	//매개변수가 4개 있는 생성자
	public User(String name, int age, String id, String pw) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
	}

	//기본생성자 => 기본적으로 컴파일러가 만들어주나, 
	//우리가 생성자를 만든 순간부터는 컴파일러가 만들어주지 않는다
	public User() {
		super();
	}
	
	
}
