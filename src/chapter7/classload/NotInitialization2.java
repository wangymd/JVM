package chapter7.classload;
/**
 * 测试：通过子类应有父类的静态字段，数组不会导致子类初始化
 * @author win7
 *
 */

public class NotInitialization2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SuperClass[] superClasses = new SuperClass[10];
	}

}
