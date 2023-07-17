package Week1.day1;


public class Car {
	  public void ApplyingBreak()
	  {
		     System.out.println("ApplyingBreak");
	  }
	  public void switchonAc()
	  {
			  System.out.println("switchonAc");
	  } 
 
	  public void ApplyingGear()
	  {
			  System.out.println("ApplyingGear");
	  }
  
	  public void ApplyAccelerator ()
      {
			  System.out.println("ApplyingAccelerator");
	  }
       public static void main(String[] args)
       {
    	   Car myCar=new Car();
    	   myCar.ApplyingBreak();
    	   myCar.switchonAc();
    	   myCar.ApplyingGear();
    	   myCar.ApplyAccelerator();
    	   
       }
       }

