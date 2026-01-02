package control;
// 5번 : 제어문 - 반복문(for문)
public class ForTest {
	public static void main(String[] args) {
		
//		for(초기식; 조건식; 증감식) {}
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
		
		for(int i = 1; i < 5; i++) {
			//int i에 1이라는 초기식 대입, 조건식으로 가서 1이 6보다 작니? true
			// 중괄호 안의 실행문 실행
			System.out.println(i);
			// 실행문 실행 후 증감식으로 올라간다 i++는 i에 +1 한것과 같다
			// i++한 값을 가지고 조건식으로 이동 다시 조건을 비교한다 
			// true면? 중괄호 안의 실행문 실행
			// 반복 실행하다가 조건식의 결과가 false면 for문의 중괄호 영역을 벗어난다
		}
		
		//반복문(for문)과 if~else문으로 짝수 홀수 출력하기
		for(int i = 1; i < 5; i++) {
			if(i % 2 == 0) {
				//%는 산술연산자 중 나머지 연산자
				//==는 관계연산자 중 같다를 의미하는 연산자
				//산술연산자와 관계연산자의 우선순위는 산술연산자가 더 크므로(빠르므로)
				//산술연산한 결과를 관계연산자와 확인하게 된다
				//최단산쉬 관리삼대
				System.out.println(i + "는 짝수입니다");
			}else {
				System.out.println(i + "는 홀수입니다");
			}
		}
		
	}
}
