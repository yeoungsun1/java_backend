package userLogin;
//5번 : User 클래스 필드에 private 붙히고 게터만들지 않았을때
public class UserMain {
	public static void main(String[] args) {
		User user1 = new User();
		System.out.println(user1);
		System.out.println(user1.getAge());
		user1.setAge(20);
		System.out.println(user1.getAge());
		System.out.println(user1);
		
	}
}
