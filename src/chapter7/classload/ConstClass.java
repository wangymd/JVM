package chapter7.classload;

public class ConstClass{
	static{
		System.out.println("ConstClass init !");
	}
	
	public static final String HELLO_WORLD = "Hello World !";
}
