package signup;
//2번 : User 클래스의 객체를 만들 Main 클래스
public class Main {
	public static void main(String[] args) {
		User user1 = new User();
		System.out.println(user1);
		User user2 = new User();
		System.out.println(user2);
		
		System.out.println(user1.name);
		System.out.println(user1.age);
		user1.name = "홍길동";
		user1.age = 20;
		user1.id = "hong";
		user1.pw = "hong123";
		System.out.println(user1.name);
		System.out.println(user1.age);
		System.out.println(user1.id);
		System.out.println(user1.pw);
		
		//위에 user2로 바꾼것을 다시 user1으로 바꾼 뒤 user2 객체에도 4개의 필드 값을 저장 후 출력
		user2.name = "신짱구";
		user2.age = 5;
		user2.id = "gu";
		user2.pw = "1234";
		System.out.println(user2.name);
		System.out.println(user2.age);
		System.out.println(user2.id);
		System.out.println(user2.pw);
		//User 클래스에서 만든 printInfo() 메소드 호출
		//객체명.메소드명()
		user1.printInfo();
		user2.printInfo();
	}
	
}
