package design.structure.proxy.dynamic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler
{

	private Object sub;
	
	/**
	 * 构建InvocationHandler的实现类，用于创建动态代理类
	 * 
	 * @param classType 目标类的Class类型
	 * @param args 构建目标对象的构造函数所需的参数
	 * @throws Exception
	 */
	public DynamicProxyHandler(Class<?> classType, Object... args) throws Exception
	{
		if(args != null)
		{
			Class<?>[] argClazzes = new Class<?>[args.length];
			for(int i = 0; i < args.length; i++)
			{
				argClazzes[i] = args[i].getClass();
			}
			Constructor<?> constructor = classType.getConstructor(argClazzes);
			this.sub = constructor.newInstance(args);
		}
		else
		{
			this.sub = classType.newInstance();
		}
	}
	
	/**
	 * @param proxy 是调用该方法的代理类
	 * @param method 是在不同情况下调用的方法
	 * @param args 是调用该method方法所需要的参数
	 * 
	 * @return 是代理类返回的对象 
	 * 
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{		
		System.out.println("before calling : " + method);
		
		method.invoke(sub, args);
		
		System.out.println("before calling : " + method);
		return null;
	}
}
