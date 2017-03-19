package vm.chapter2;
/**
 * 长期存活的对象进入老年代
 * @author wangymd
 *VM参数： 
-verbose:gc -Xmx20M -Xms20M -Xmn10M 
-XX:+PrintGCDetails 
-XX:SurvivorRatio=8
-XX:MaxTenuringThreshold=1
-XX:PrintTenuringDistribution
 */
public class Vm_3_7 {

	private static final int  SIZE = 1024*1024;
	public static void main(String[] args) {
		testPretenureSizeThreshold();
	}

	private static void testPretenureSizeThreshold() {
		byte[] alloction1,alloction2,alloction3;
		alloction1 = new byte[SIZE / 4];
		alloction2 = new byte[SIZE * 4];
		alloction3 = new byte[SIZE * 4];
		
		alloction3 = null;
		alloction3 = new byte[SIZE * 4];
		System.out.println("长期存活的对象进入老年代");
	}

}
