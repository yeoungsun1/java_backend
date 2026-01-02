package user;

//1번 : 사용자의 정보를 담을 수 있는 User 클래스
public class User {
	// 필드
	String name;
	int age;
	String id;
	String pw;

	// 생성자 : alt + shift + s + o
	// 객체지향언어 다형성 특징 중 하나 : 오버로딩(생성자 오버로딩과 메소드 오버로딩이 있다)
	// 오버로딩 : 매개변수의 개수, 순서, 타입이 다르면 같은이름의 생성자나 메소드를 여러개를 생성할 수 있다
	public User() {
		super();
	}

	public User(String name, int age, String id, String pw) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
	}

	//toString 단축키 : alt + shift + s , s
	//객체의 주소값 대신에 필드에 저장된 값으로 확인할 때 사용한다
	//@Override 오버라이딩 : 다형성 특징중 하나
	//오버라이딩 : 부모 클래스에 있는 메소드를 내용만(구현부만) 수정해서 사용하도록 하는 것을 의미한다
	//선언부는 부모 클래스에 있는 메소드와 동일해야하며 구현부만 재정의해서 사용한다
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + "]";
	}

//	@Override //@는 자바에서 어노테이션이라고 한다, 오버라이딩이라고한다
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	
	//000님 환영합니다 출력하는 기능 (매개변수 x, 리턴값 x 메소드 정의)
	//접근제한자 반환타입 메소드명() { }
	public void printInfo() {
		System.out.println(this.name + "님 환영합니다!");
		System.out.println(this.id + "로 회원가입이 완료되었습니다!");
	}
}
