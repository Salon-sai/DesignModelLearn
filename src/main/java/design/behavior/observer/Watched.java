package design.behavior.observer;

public interface Watched
{
	public void addWatcher(Watcher watcher);
	
	public void removeWatcher(Watcher watcher);
	
	public void notifiyWatchers(String str);
}
