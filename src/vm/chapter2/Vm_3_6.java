package vm.chapter2;
/**
 * �������������
 * @author wangymd
 *VM������ 
-verbose:gc -Xmx20M -Xms20M -Xmn10M 
-XX:+PrintGCDetials 
-XX:SurvivorRatio=8
-XX:PretenureSizeThreshold=3145728
 */
public class Vm_3_6 {

	private static final int  SIZE = 1024*1024;
	public static void main(String[] args) {
		testPretenureSizeThreshold();
	}

	private static void testPretenureSizeThreshold() {
		byte[] alloction;
		alloction = new byte[SIZE * 4];
		System.out.println("�������������");
	}

}
