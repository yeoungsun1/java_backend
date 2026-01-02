package controlOperator;

import java.util.Scanner;

// 1번 : 짝수 홀수 구하기
public class Operator {
	public static void main(String[] args) {
		//1. 삼항연산자 이용
		//Q. 입력받은 값으로 짝수, 홀수 구하기
		//1) 입력 클래스 import
		Scanner sc = new Scanner(System.in);
		//2) 어떤값을 입력받을지 메시지 출력
//		System.out.println("정수 입력 : ");
		//3) 정수형 변수 선언, 정수형 입력 메소드 사용
//		int num = sc.nextInt();
//		System.out.println("입력한 값 : " + num);
		//4) 문자열 변수 선언, 삼항 연산자(조건식) ? 참일때 값 : 거짓일 때 값; 로 값 대입
		//4-1) 짝수 구하기 => 산술연산자(나머지연산자 %)와 관계연산자(==) 사용
//		String result = (num % 2 == 0) ? "짝수" : "홀수";
		//5) 문자열 변수 출력(결과출력)
//		System.out.println(result);
		
		//2. if~else문 이용
		//4) if (변수 % 2 == 1) {
		//4-1) 조건식이 true일 때 결과 출력 홀수 }
		//5) else {
		//5-1) 조건식이 false일 때 결과 출력 짝수 }
//		if(num % 2 == 1) {
//			System.out.println("홀수");
//		}else {
//			System.out.println("짝수");
//		}
		
		//3. 반복문과 조건식 이용(삼항연산자든 if~else문이든 편한걸로 사용)
		for(int i = 0; i < 3; i++) {
			System.out.println((i+1) + "번째 정수 입력 : ");
			int num = sc.nextInt();
			System.out.println("입력한 값 : " + num);
			System.out.println((num%2 == 0) ? "짝수" : "홀수");
		}
		
	}
}
