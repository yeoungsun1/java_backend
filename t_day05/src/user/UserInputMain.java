package user;

import java.util.Scanner;

//3번 : User 클래스의 객체에 입력한 값으로 저장하기
public class UserInputMain {
	public static void main(String[] args) {
		//입력 => Scanner 클래스 사용
		Scanner sc = new Scanner(System.in);
		//import 자동완성 단축키 : ctrl + shift + o
		
		//입력받기
		//어떤 값을 입력받을 것인지 입력 메시지 출력
//		System.out.println("이름 입력 : ");
//		String name = sc.next();
//		System.out.println("나이 입력 : ");
//		int age = sc.nextInt();
//		sc.nextLine();
//		System.out.println("아이디 입력 : ");
//		String id = sc.nextLine();
//		System.out.println("비밀번호 입력 : ");
//		String pw = sc.nextLine();
//		
//		System.out.println(name + "님의 아이디는 " + id + "입니다.");
//		
//		//User 클래스의 객체 만들기
//		//클래스의 객체 생성
//		//클래스명 객체명 대입연산자 new 생성자;
//		User user = new User(name, age, id, pw);
//		System.out.println(user);
//		
//		System.out.println("이름 입력 : ");
//		String name1 = sc.next();
//		System.out.println("나이 입력 : ");
//		int age1 = sc.nextInt();
//		sc.nextLine();
//		System.out.println("아이디 입력 : ");
//		String id1 = sc.nextLine();
//		System.out.println("비밀번호 입력 : ");
//		String pw1 = sc.nextLine();
//		User pr = new User(name1, age1, id1, pw1);
//		System.out.println(pr.name);
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println("이름 입력 : ");
			String userName = sc.nextLine();
			System.out.println("나이 입력 : ");
			int userAge = sc.nextInt();
			System.out.println("아이디 입력 : ");
			String userId = sc.nextLine();
			System.out.println("비밀번호 입력 : ");
			String userPw = sc.nextLine();
			System.out.println(userName); 
			//for문 안에서 변수를 선언하고 값을 저장하면
			//for문 안에서만 사용할 수 있다
		} //for문의 중괄호 영역 끝
		
//		String name = null;
//		int age = 0;
//		for(int i = 0; i < 3; i++) {
//			name = sc.nextLine();
//			age = sc.nextInt();
//			sc.nextLine();
//		}
//		System.out.println(name);
//		
		
		String name1 = "짱구";
		System.out.println(name1);
		name1 = "철수";
		
		
		
	}
}
