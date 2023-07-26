package week2.day3;

public class Duplicate {
public static void main(String[] args) {
	int[]num= {1,4,5,2,6,2,9,3,5,1};
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
			if(num[i]==num[j])
			{
				System.out.println(num[i]);	
		}
		
		}
}
	
}}