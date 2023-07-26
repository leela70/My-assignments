package week2.day2;

public class LearnArray2 {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6};
		int len = num.length;
		System.out.println(len);
		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
}
		System.out.println("last index "+num[len-4]);	
}}