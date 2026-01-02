package signup;
//3번 : User 클래스에 생성자 추가
public class SingupMain {
	public static void main(String[] args) {
		//매개변수 4개있는 생성자로 객체 생성하기
		User user1 = new User("홍길동", 10, "dong", "h1234");
		//객체 초기화에 생성자를 이용하면 코드가 줄어든다(객체명.필드명별로 값을 따로 추가하지 않아도되기때문)
//		String name, int age, String id, String pw
		
		System.out.println(user1);
		System.out.println(user1.name);
		System.out.println(user1.age);
		System.out.println(user1.id);
		System.out.println(user1.pw);
		
		
	}

}
