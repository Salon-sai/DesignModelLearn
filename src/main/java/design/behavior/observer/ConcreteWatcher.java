package design.behavior.observer;

public class ConcreteWatcher implements Watcher
{

	public void update(String str)
	{
		System.out.println(str);
	}
}
