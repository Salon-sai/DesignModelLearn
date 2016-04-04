package design.behavior.command;

public class Client
{

	public static void main(String[] args)
	{
		Receiver receiver = new Receiver();//首先要有接受者，发出一个请求或者要执行的内容
		
		Command command = new ConcreteCommand(receiver);//把接收者传入到命令，生成一个命令。命令成为接收者与执行者直接的桥梁
		
		Invoker invoker = new Invoker(command);//执行者接受到命令后，执行命令的内容（实际上是执行接受者的内容）
		
		invoker.doInvokerAction();
	}
	
}
