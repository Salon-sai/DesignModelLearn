package design.behavior.command;

/*
 * 
 */
public class ConcreteCommand implements Command
{
	// 获取接受者
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver)
	{
		this.receiver = receiver;
	}
	
	// 执行接收者的操作，接收者是命令的发起者。
	public void execute()
	{
		receiver.doAction();
	}
	
}
