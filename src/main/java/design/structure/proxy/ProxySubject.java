package design.structure.proxy;

public class ProxySubject implements Subject
{

	private RealSubject realsubject;

	public ProxySubject()
	{
		this.realsubject = new RealSubject();
	}

	public void request()
	{
		this.preRequest();
		realsubject.request();
		System.out.println("proxy subject");
		this.postRequest();
	}

	private void preRequest()
	{
		System.out.println("pre request");
	}
	
	
	private void postRequest()
	{
		System.out.println("post request");
	}
}
