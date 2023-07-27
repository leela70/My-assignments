package week2.day4;

public class PrintString {
	public static void main(String args[]) {
		String text = "Pravallika";
		char charArray[] = text.toCharArray();
		for(int i = charArray.length-1;i>=0;i--) {
			System.err.print(charArray[i] +" ");
			
		}
		System.err.println();
		for(int j=0;j<charArray.length;j++) {
			System.err.println(charArray[j] +" ");
		}
		System.err.println();
		int length = text.length();
		{
			System.err.print(length);
		}
	}

}
