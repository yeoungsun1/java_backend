package control;
//4번 : 제어문 - 조건문(if문)
public class IfTest {
	public static void main(String[] args) {
		//조건식의 결과는 항상 boolean 타입(true/false)여야한다
		
		int num = 1;
		if(num > 10) {
		//관계연산자 : >(크다), <(작다), >=(크거나 같다), <=(작거나 같다), ==(같다), !=(같지않다)
			System.out.println("num은 10보다 큽니다");
		}else {
			System.out.println("num은 10보다 크지 않습니다");
		}//else문 끝 중괄호영역
		System.out.println("if~else문 영역 끝");
		
		System.out.println("if~else if~else문");
		int num1 = 7;
		if(num1 > 0) {
			System.out.println("num1은 10보다 큽니다");
		}else if(10 > num1 && num1 > 3) { // 3 < 7 < 10
			//자바에서는 2개이상의 값을 확인할 때 논리연산자를 이용해야한다
			// 조건식1 && 조건식2 : 조건식1과 조건식2 모두 true일 때 true
			// 조건식1 || 조건식2 : 조건식1 또는 조건식2 둘 중 하나라도 true일 때 true
			System.out.println("num1은 3보다 크고 10보다 작습니다.");
		}else if(num1 < 2 && num1 > 0) {
			System.out.println("num1은 0보다 크고 2보다 작습니다");
		}else {
			System.out.println("num1은 0보다 작습니다");
		}
		System.out.println("if~else if~else문 출력 끝");
	} //메인 메소드 끝 중괄호 영역
}//클래스 끝 중괄호 영역
