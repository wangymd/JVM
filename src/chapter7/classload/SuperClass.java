package chapter7.classload;
/**
 * 通过子类应有父类的静态字段，不会导致子类初始化
 * @author win7
 *
 */
public class SuperClass {
	static {
		System.out.println("SuperClass init !");
	}
	
	public static int value = 110;

}
