package design.structure.proxy.dynamic;

public class RealSubject implements Subject
{
	public void request()
	{
		System.out.println("real subject invoke");
	}
}
