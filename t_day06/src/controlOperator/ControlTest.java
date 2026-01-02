package controlOperator;
//3번 : break문과 continue문
public class ControlTest {
	public static void main(String[] args) {
		
		//1. break문 이용하여 반복 중단(반복문 즉시 탈출)
		for(int i = 1; i <= 10; i++) {
			if(i==6) {
				break;
			}
			System.out.println(i);
		}
		
		//2. continue문 이용하여 특정값 건너뛰기(다음 반복으로 이동, 현재 반복은 스킵)
		for(int i = 1; i <= 10; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}
