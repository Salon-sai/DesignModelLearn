动态代理类
	所谓Dynamic Proxy 是这样的一个Class：
	它是在运行时生成的class，在生成它时你必须提供一组interface给它，然后该class就宣称它实现了这些interface。你当然可以把该class的实例当作这些interface中的任何一个来用。当然，这个Dynamic Proxy其实是一个proxy，它不会你做任何实际的工作，在生成它的实例时，你必须提供一个handler，由他接管实际工作
	
动态代理步骤
	1.创建一个实现接口InvocationHandler的类，它必须实现invoke方法
	2.创建被代理的类以及接口
	3.通过Proxy的静态方法 newProxyInstance(ClassLoader loader, Class[] interfaces, InvicationHandler h)创建一个代理
	4.通过代理调用方法