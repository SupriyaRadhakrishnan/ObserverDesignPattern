
public class Subscriber {
	
	private String name;
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	private Channel channel = new Channel();
	
	public void update()
	{
		System.out.println(name + " : New Video");
	}
	
	public void subscribeTo(Channel ch)
	{
		channel = ch;
	}
	
	

}
