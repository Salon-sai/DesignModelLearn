package design.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;

public class Client
{
	@Test
	public void test() throws Exception
	{
		InvocationHandler handler = new DynamicProxyHandler(RealSubject.class);
		
		Class<?> clazz = handler.getClass();
		
		// clazz 代理的handler的类型，interfaces 是目标对象所继承的所有接口，根据这些接口可以生成一个继承这些接口的代理类
		// 然后传入handler就可以调用目标对象的方法
		Subject subject = (Subject)Proxy.newProxyInstance(clazz.getClassLoader(), 
				RealSubject.class.getInterfaces(), handler);
		
		// 这里的subject是一个代理的subject，它调用request方法其实是调用handler里面的invoke的方法
		// 在调用invoke方法的时候可以额外执行其他方法。而且得到这个handler返回invoke执行返回的内容
		subject.request();
		
		System.out.println(subject);
	}
}
