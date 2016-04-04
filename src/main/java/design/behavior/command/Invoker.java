package design.behavior.command;

/**
 * 执行者（Invoker）执行该命令内容，它并不关心接受者是谁。
 * @author sai
 *
 */
public class Invoker
{
	// 获得命令
	private Command command;
	
	public Invoker(Command command)
	{
		this.command = command;
	}
	
	// 执行命令内容
	public void doInvokerAction()
	{
		command.execute();
	}
	
}
