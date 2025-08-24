
public class 연습 {

	public static void main(String[] args) {
		
		String str = "hello";
		char ch = str.charAt(0);
		System.out.println(ch);
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		for (char s : str.toCharArray()) {
			System.out.println(s);
		}
	}
}
