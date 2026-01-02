package methodTest;

public class MethodTest4 {
	//매개변수 o, 리턴값 o 메소드 정의
    int add(int num1, int num2) {
    	System.out.println("매개변수 num1에 전달된 값 : " + num1);
    	System.out.println("매개변수 num2에 전달된 값 : " + num2);
    	System.out.println("총합은 " + (num1 + num2) + "입니다.");
        return num1 + num2;
    }
}
