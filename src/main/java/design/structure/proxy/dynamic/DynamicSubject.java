package design.structure.proxy.dynamic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler
{

	private Object sub;
	
	public DynamicSubject(Class<?> classType, Object... args) throws Exception
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
