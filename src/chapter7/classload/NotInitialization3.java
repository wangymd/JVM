package chapter7.classload;
/**
 * 编译阶段通过常量传播优化，将常量存储到NotInitialization3
 * （调用类的常量池中，变成是对自身常量的引用）
 * @author wangymd
 *
 */

public class NotInitialization3 {

	public static void main(String[] args) {

		System.out.println(ConstClass.HELLO_WORLD);
	}

}
