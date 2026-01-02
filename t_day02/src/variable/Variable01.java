package variable;
// 3번 : 변수 선언과 초기화
public class Variable01 { //클래스 시작 중괄호 영역
	public static void main(String[] args) { //main 메소드 시작 중괄호영역
		//자료형 변수명;
		//변수명 = 값;
		int age;	// 정수형 저장공간의 이름을 age로 선언
		age = 20;	// age 저장공간에 20이라는 정수형 값을 대입(저장)
		System.out.println(age); // age안에 저장된 값(20)을 콘솔창에 출력하고 줄바꿈
		
		//자료형 변수명 = 값;
		String name = "김영선"; // 문자열 저장공간의 이름을 name으로 선언
							// name 변수에 "김영선"이라는 문자열값을 대입
		System.out.println(name); //name에 저장된 문자열값을 콘솔창에 출력하고 줄바꿈
		
		//1) id(문자열)와 pw(정수형)라는 이름의 저장공간을 만들기
		String id;
		int pw;
		//2) 해당 자료형에 맞게 값 초기화
		id = "korea";
		pw = 1234;
		//3) id, pw를 각각 출력(syso + ctrl + space bar + enter)
		System.out.println(id);
		System.out.println(pw);
		
		System.out.println(name + "님 환영합니다!");
		// 문자열값 + 문자열값 => 연결
		// 숫자값 + 숫자값 => 연산
		
		//출력 내용이 김영선님 환영합니다! 김영선님의 id는 korea고, pw는 1234입니다
		System.out.println(name + "님 환영합니다! " + name + "님의 id는 " + id +"고, pw는 " + pw + "입니다.");
		System.out.printf("%s님 환영합니다! %s님의 id는 %s고, pw는 %d입니다.", name, name, id, pw);
		
	}//main 메소드 끝 중괄호영역
}//클래스 끝 중괄호영역
