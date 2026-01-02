package user;

//1번 : 회원 정보를 저장할 User 클래스
public class User {
	// 필드
	// private 접근제한자가 있는 필드 4개 생성
	private String name;
	private int age;
	private String id;
	private String pw;

	// 생성자 : alt + shift + s , o
	// 기본 생성자
	public User() {
		super();
	}

	// 매개변수가 4개인 생성자
	public User(String name, int age, String id, String pw) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
	}

	// 메소드
	// getter : alt + shift + s, r
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	// 회원정보 출력 메소드 : 매개변수x, 리턴값x 메소드 정의
	public void printInfo() {
		System.out.println("====[회원정보]====");
		System.out.println(this.name + "님의 아이디는 " + this.id + "입니다.");
		System.out.println("================");
	}

	// toString 메소드 오버라이딩 : alt + shift + s , s
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + "]";
	}

}
