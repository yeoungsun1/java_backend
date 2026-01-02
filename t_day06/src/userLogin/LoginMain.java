package userLogin;

import java.util.ArrayList;
import java.util.Scanner;

//7번 : 로그인 검증 메소드
public class LoginMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoginMain l = new LoginMain();
		
		//회원 목록 생성
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("짱구", 5, "gu", "korea"));
		users.add(new User("철수", 5, "chul", "asdf"));
		users.add(new User("유리", 5, "yuri", "qwer1234"));

		System.out.println(users);
//		for(int i=0; i<3; i++) {
//			User u = users.get(i);
//			System.out.println(u);
//			System.out.println(u.getName());
//		}

		//빠른 for문, for-each문 : 인덱스 사용 불가능하다
		for(User u : users) {
//			System.out.println(u);
			System.out.println("이름 : " + u.getName() + ", 아이디 : " + u.getId());
		}
		
		//로그인 메소드 호출(사용)
		l.login(users);
		
		
	} //메인 메소드 중괄호 영역 끝
	
	//로그인 메소드 정의
	void login(ArrayList<User> users) {
		Scanner sc = new Scanner(System.in);
		//로그인(사용자로부터 아이디와 비밀번호 입력받아서 로그인 성공 여부 출력하기)
		System.out.println("아이디를 입력하세요 : ");
		String inputId = sc.nextLine();
		System.out.println("비밀번호를 입력하세요 : ");
		String inputPw = sc.nextLine();
		
		for(User u : users) {
			if(u.getId().equals(inputId)) {
				if(u.getPw().equals(inputPw)) {
					System.out.println("로그인 성공!!");
					u.printInfo();
					break;
				}
				System.out.println("비밀번호가 틀렸습니다.");
				break;
			}
			System.out.println("아이디가 없습니다.");
			break;
		}
		
	}
	
}
