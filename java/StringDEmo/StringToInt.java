package StringDEmo;

public class StringToInt {
	
	
	
	public static int StringToInt(String str) {
		boolean isNegetive = false;
		int i = 0;
		int result=0;
		if(str.charAt(0) == '-') {
			isNegetive = true;
		    i=1;
		}
		for(;i<str.length();i++) {
			char c=str.charAt(i);
			if(c >='0' && c<='9') {
				int digit = c - '0';
				result = result * 10 + digit;
			}else {
				throw new IllegalArgumentException("Invalid char in String");
			}
		}
		if(isNegetive) {
			result= - result;
			}
		return result;
	}
	
	public static void main(String[] args) {
	
		String str="12345";
		int result = StringToInt(str);
		System.out.println(result);

	}
}
