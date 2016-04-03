package design.behavior.observer;

import org.junit.Test;

public class TestObserver
{
	@Test
	public void test()
	{
		Watched girl = new ConcreteWatched();
		
		Watcher watcher1 = new ConcreteWatcher();
		Watcher watcher2 = new ConcreteWatcher();
		Watcher watcher3 = new ConcreteWatcher();
		
		girl.addWatcher(watcher1);
		girl.addWatcher(watcher2);
		girl.addWatcher(watcher3);
		
		girl.notifiyWatchers("fuck me");
		
		girl.removeWatcher(watcher2);
		
		girl.notifiyWatchers("dont fuck me");
	}
}
