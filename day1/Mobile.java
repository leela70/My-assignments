package Week1.day1;

public class Mobile {
      private static final Mobile MyMobile = null;
	public void Talking()
      {
    	  System.out.println("Talking");
      }
      public void chatting()
      {
    	  System.out.println("chatting");
      }
      public void reading()
      {
    	  System.out.println("reading");
      }
      public void watching()
      {
    	  System.out.println("watching");
      }
      public static void main(String[]args)
      {
            Mobile MyMobile=new Mobile();
            MyMobile.Talking();
            MyMobile.chatting();
            MyMobile.reading();
            MyMobile.watching();

      }
}
      


