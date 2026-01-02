package review;
//1번 : 복습(printf 출력메소드)
public class PrintTest {
	public static void main(String[] args) {
		//printf() : 서식에 맞는 값을 콘솔창에 출력하고 줄바꿈이 되지 않는다
		//서식 => 자료형과도 관계가 있다
		//자료형(Data Type)				서식문자
		//정수형 byte, short, int, long	%d
		//실수형 double, float			%f
		//논리형 boolean					%s
		//문자형 char						%c
		//문자열 String					%s
		
		System.out.printf("%s %d %.2f %s %c\n", true, -10, 3.14, "hello", 'a');
		
//		int user age = 20;
//		int userAge = 20;
//		int user_age = 20;
//		int userage = 20;
//		int 1age = 20;
//		int user1age = 20;
//		int age1 = 20;
//		int if = 20;
//		int $age = 20;
		
		//이름(name 문자열), 나이(age 정수형), 취미(hobby 문자열)를 변수에 저장하고 
		//println, print, printf를 이용하여 각각 출력하기
		//출력예시
		//이름 : 000, 나이 : 00살, 취미 : 여행
		//이름 : 000, 나이 : 00살, 취미 : 여행이름 : 000, 나이 : 00살, 취미 : 여행
		
		//1) 변수 선언과 동시에 초기화
		//1-1) 문자열 String 변수명 name 값 : 
		String name = "김영선";
		//1-2) 정수형 int 변수명 age 값 : 
		int age = 20;
		//1-3) 문자열 String 변수명 hobby 값 : 
		String hobby = "여행";
		//2) println, print, printf로 출력하기
//		System.out.println();
		System.out.println("\n이름 : \"" +  name  + "\",\n\t나이 : " + age + "살, 취미 : " + hobby );
		System.out.print("이름 : " + name + ", 나이 : " + age + "살, 취미 : " + hobby + "\n");
		System.out.printf("이름 : %s, 나이 : %d살, 취미 : %s\n", name, age, hobby);
		
		//변수 선언시 조건
		// 띄어쓰기 불가능
		// 숫자로 시작 불가능
		// 키워드(예약어)로 생성 불가능
		// 특수기호도 불가능(_, $)
		// 왠만하면 의미있는 단어를 사용한다	
		//	name, userName, age, number1, num1, data1
		
		//1) 소문자로 시작하고 단어가 바뀔때 첫단어를 대문자로 작성한다(자바에서 변수선언시 : 카멜표기법)
		// 	userName
		//2) 소문자로 시작하고 단어가 바뀔 때 _로 연결한다(파이썬에서 변수선언시 : 스네이크 표기법)
		// user_name
		// 자바에서는 상수 선언시 모든 단어를 대문자로 작성 단어가 바뀔때 _로 연결
		// final String USER_NAME = "홍길동"; 
		//3) 첫글자를 대문자로 시작, 단어가 바뀔때 첫 문자를 대문자로 작성(클래스명 작성시 : 파스칼 표기법)
		// PrintTest
		
		//이스케이프 문자 : 문자열안에서 다양하게 표현할 수 있도록 만들어졌다
		// \와 반드시 함께 써야한다
		// \n : 줄바꿈, \t : tab키 적용, \', \"
	}
}






