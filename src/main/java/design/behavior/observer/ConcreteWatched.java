package design.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWatched implements Watched
{
	
	private List<Watcher> list = new ArrayList<Watcher>();

	public void addWatcher(Watcher watcher)
	{
		list.add(watcher);
	}

	public void removeWatcher(Watcher watcher)
	{
		list.remove(watcher);
	}

	public void notifiyWatchers(String str)
	{
		for (Watcher watcher : list)
			watcher.update(str);
	}

}
