package vm.chapter2;
/**
 * 空间分配担保
 * @author wangymd
 *VM参数： 
-verbose:gc -Xmx20M -Xms20M -Xmn10M 
-XX:+PrintGCDetails 
-XX:SurvivorRatio=8
-XX:MaxTenuringThreshold=1
-XX:-HandlerPromotionFailure
 */
public class Vm_3_9 {

	private static final int  SIZE = 1024*1024;
	public static void main(String[] args) {
		testPretenureSizeThreshold();
	}

	private static void testPretenureSizeThreshold() {
		byte[] alloction1,alloction2,alloction3,alloction4,alloction5,alloction6,alloction7;
		alloction1 = new byte[SIZE * 2];
		alloction2 = new byte[SIZE * 2];
		alloction3 = new byte[SIZE * 2];
		alloction3 = null;
		alloction4 = new byte[SIZE * 2];
		alloction5 = new byte[SIZE * 2];
		alloction6 = new byte[SIZE * 2];
		alloction4 = null;
		alloction5 = null;
		alloction6 = null;
		alloction7 = new byte[SIZE * 2];
		System.out.println("空间分配担保");
	}

}
