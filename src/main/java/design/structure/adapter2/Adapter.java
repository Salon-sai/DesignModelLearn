package design.structure.adapter2;

public class Adapter implements Target
{
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee)
	{
		this.adaptee = adaptee;
	}
	
	public void method2()
	{
		System.out.println("invoke method2");
		adaptee.method1();
	}
}
