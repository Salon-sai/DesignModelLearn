package design.behavior.templatemethod;

public abstract class Template
{
	public abstract void method1();
	
	public abstract void method2();
	
	public abstract void method3();
	
	public void template()
	{
		this.method1();
		this.method2();
		this.method3();
	}
	
}
