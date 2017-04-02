package chapter7.classload;

public class DeadLoopClass {
	
	static {
		if(true){
			System.out.println(Thread.currentThread() + "init DeadLoopClass");
			while(true){
				
			}
		}
	}

	public static void main(String[] args) {
		
		Runnable defThread = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println(Thread.currentThread()+ "start");
				DeadLoopClass deadLoopClass = new DeadLoopClass();
				System.out.println(Thread.currentThread()+ "run over");
			}
		};
		
		Thread thread1 = new Thread(defThread);
		Thread thread2 = new Thread(defThread);
		
		thread1.start();
		thread2.start();
		

	}

}
