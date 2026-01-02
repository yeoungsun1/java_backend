package userLogin;

//4번 : 사용자 정보를 담을 수 있는 User 클래스
public class User {
	// 필드
	private String name;
	private int age;
	private String id;
	private String pw;

	// 생성자
	// 기본생성자
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

	// toString 오버라이딩 단축키 : alt + shift + s , s
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + "]";
	}

	// 게터, 세터 : private 접근제한자가 붙은 필드에 값을 저장하거나 출력할 때 사용하는 메소드
	// private 접근제한자가 붙게되면 같은 클래스 내에서만 사용 가능하다
	// 게터, 세터 만들기 단축키 : alt + shift + s , r
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	// 이름을 출력하고 환영인사하는 기능
	public void printInfo() {
		System.out.println(this.name + "님 환영합니다!");
		System.out.println(this.id + "로 회원가입되었습니다!");
	}

}
