package week2.day2;

import java.util.Arrays;

public class SortTheValues {
public static void main(String[] args) {
	int []numbers= {10,30,20,50,40};
	Arrays.sort (numbers);
	for(int i=0; i<numbers.length; i++)
	{
		System.out.println(numbers[i]+"");
	}
}
}
