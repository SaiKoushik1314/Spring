package myspring.practice;

public class MyHello {
	private String mymessage;

	public void getMymessage() {
		 System.out.println("Your Message : " + mymessage);	}

	public void setMymessage(String mymessage) {
		this.mymessage = mymessage;
	}
	public void init(){
		System.out.println("MySpring");
	}
	public void destroy(){
		System.out.println("Bye Sai");
	}

}
