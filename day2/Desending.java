package week2.day2;

import java.util.Arrays;

public class Desending {
		public static void main(String[] args) {
			int []numbers= {10,30,20,50,40};
			Arrays.sort (numbers);
			System.out.println(Arrays.toString(numbers));
			for(int i=numbers.length-1; i>=0; i--)
			{
				System.out.println(numbers[i]);
			}
		}
		}
