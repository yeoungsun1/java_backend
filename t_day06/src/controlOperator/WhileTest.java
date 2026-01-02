package controlOperator;
//2번 : while문과 do~while문
public class WhileTest {
	public static void main(String[] args) {
		//3번 반복 출력을 while문 이용해서 출력하기
		
		//1) 비교 대상 변수 선언 후 초기화
		int i = 0;
		//2) while문 
		//2-1) 조건식 => i <= 2 {
		//2-2) 실행문 => "while문 반복" 출력
		//}
		while(i > 2) {
			System.out.println("while문 반복");
//			i = i + 1;
//			i += 1;
			i++;
		}
		
		//do ~ while문으로 3번 출력
		do {
			System.out.println("do~while문 반복");
			i++;
		}while(i > 2);
		
	}

}
