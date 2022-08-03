package p01.basic;

// 전체 문자열에서 일부 문자열 가져오기 : substring (startIndex, endIndex) method
// 1. startIndex = 0부터 시작, 일부 문자열 가져오기에 포함
// 2. endIndex는 일부 문자열 가져오기에 불포함
//		(endIndex-1 문자까지 가져옴)
// 3. startIndex 값은 있고 endIndex값이 없는 경우
//		- startIndex 부터 문자열 끝까지의 데이터를 가져옴
//		- 예 : message,substring(0)
public class StringBasic8 {

	public static void main(String[] args) {
		String message = "Welcome to Java";
		
		
		System.out.println(message.substring(0, 5));
		System.out.println(message.substring(0, 7));
		System.out.println(message.substring(0, 11));
		
		System.out.println(message.substring(2, 5));
		System.out.println(message.substring(2, 7));
		System.out.println(message.substring(2, 11));
		
		System.out.println(message.substring(0));
		System.out.println(message.substring(2));
		
		
		
	}

}
