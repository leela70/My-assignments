package week2.day4;

public class findintersection {
public static void main(String[] args) {
	//Declare An array for {3,2,11,4,6,7};	 
	int [] num1= {3,2,11,4,6,7}; 
	//Declare another array for {1,2,8,4,9,7};
	int [] num2= {1,2,8,4,9,7};
	int a=num1.length;
	int b=num2.length;
	
	// Declare for loop iterator from 0 to array length
	for(int i=0;i<a;i++)
	{
		// Declare a nested for another array from 0 to array length
		for(int j=0;j<b;j++)
		{
		//Compare Both the arrays using a condition statement
	if(num1[i]==num2[j])
	{
		System.out.println(num1[i]);
	
	}
}
}
		}
}