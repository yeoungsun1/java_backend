package user;
//2번 : User클래스의 객체를 만들 UserMain 클래스(메소드 만들기 전)
public class UserMain {
	public static void main(String[] args) {
		User user1 = new User(); // 짱구, 5, gu, 1234의 값을 갖도록
		System.out.println(user1); //user.User@279f2327
		System.out.println(user1.age);
		user1.age = 5;
		user1.name = "짱구";
		user1.id = "gu";
		user1.pw = "1234";
		System.out.println(user1.name);
		System.out.println(user1.age);
		System.out.println(user1.id);
		System.out.println(user1.pw);
		User user2 = new User();
		user2.name = "철수";
		user2.age = 6;
		user2.id = "su";
		user2.pw = "su123";
		System.out.println(user2.name);
		System.out.println(user2.age);
		System.out.println(user2.id);
		System.out.println(user2.pw);
		System.out.println(user2); //user.User@2ff4acd0
		//1개의 객체를 만드는데 값을 대입하고 출력하는데 9줄이 필요하다
		//만약 객체에 반드시 값이 들어가야하는 상황이라면 매개변수 있는 생성자를 이용하여
		//초기화 시켜주면 코드의 양을 줄이고 가독성을 높힐 수 있다
		User user3 = new User("유리", 7, "ri", "123a");
		System.out.println(user3.name);
		System.out.println(user3.age);
		System.out.println(user3.id);
		System.out.println(user3.pw);
		System.out.println(user2); //user.User@54bedef2
		System.out.println(user3.toString()); //user.User@54bedef2
		//객체의 주소값은 각 pc마다 다를 수 있다(각 pc에 설치된 jvm에 의해서 관리되기 때문)
	
		user1.printInfo();
		user2.printInfo();
		user3.printInfo();
	}
}
