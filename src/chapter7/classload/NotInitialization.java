package chapter7.classload;
/**
 * 测试：通过子类应有父类的静态字段，不会导致子类初始化
 * @author win7
 *
 */

public class NotInitialization {

	public static void main(String[] args) {

		System.out.println(SubClass.value);
	}

}
