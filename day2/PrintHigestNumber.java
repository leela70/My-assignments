package week2.day2;

public class PrintHigestNumber {
public static void main(String[] args) {
	int[] arr=new int[] {33,77,999,22,10,5};
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]>max)
	max=arr[i];
	}
		
		System.out.println("the largest number is:"+max);
	}

}