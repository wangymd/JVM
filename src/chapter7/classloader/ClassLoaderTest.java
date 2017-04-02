package chapter7.classloader;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {
	
	public static void main(String[] args) throws Exception {
		//自定义类加载器
		ClassLoader myClassLoader = new ClassLoader() {

			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				String className = name.substring(name.lastIndexOf(".") +1) + ".class";
				
				InputStream resourceAsStream = getClass().getResourceAsStream(className);
				
				if(resourceAsStream == null){
					return super.loadClass(name);
				}
				byte[] b = null;
				try {
					b = new byte[resourceAsStream.available()];
					resourceAsStream.read(b);
				} catch (IOException e) {
					e.printStackTrace();
				}
				return defineClass(name, b, 0, b.length);
			}
			
		};
		
		Object newInstance = myClassLoader.loadClass("chapter7.classloader.ClassLoaderTest").newInstance();
		System.out.println(newInstance.getClass());
		System.out.println(newInstance instanceof chapter7.classloader.ClassLoaderTest);
	}

}
