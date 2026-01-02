package userLogin;
//6번 : User 클래스에 세터, 게터 추가 후 전체 완성 완료
public class UserMain2 {
	public static void main(String[] args) {
		User user1 = new User();
		System.out.println(user1);
		user1.setAge(20);
		user1.setName("홍길동");
		user1.setId("dong");
		user1.setPw("1234a");
		System.out.println(user1);
		
		User user2 = new User("이유리", 20, "yu12", "qwer1234");
		System.out.println(user2);
		
		
	}
}
