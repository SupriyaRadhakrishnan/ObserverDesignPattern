import java.util.*;

public class Channel {
	
	private List<Subscriber> subs = new ArrayList<>();
	private String title;
	
	
	public void subscribe(Subscriber s)
	{
		subs.add(s);
	}
	public void unsubscribe(Subscriber s)
	{
		subs.remove(s);
	}
	public void notifi()
	{
		for(Subscriber s : subs)
			s.update();
		
	}
	public void upload(String title)
	{
		this.title = title;
		notifi();
	}
	

}
