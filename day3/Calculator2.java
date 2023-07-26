package week1.day3;



public class Calculator2 {
	public int addTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	public void subTwoNumber(int total,int b) {
		int c=total-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Calculator2 calc=new Calculator2();
		int total =calc.addTwoNumber(50, 50);
		calc.subTwoNumber(total, 25);
	}

	}



