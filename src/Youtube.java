
public class Youtube {
	
	
	public static void main(String args[])
	{
		Channel madness =  new Channel();
		
		Subscriber s1 = new Subscriber("Sahi");
		Subscriber s2 = new Subscriber("Pahi");
		Subscriber s3 = new Subscriber("Kahi");
		Subscriber s4 = new Subscriber("Abhi");
		Subscriber s5 = new Subscriber("Rahi");
		
		madness.subscribe(s1);
		madness.subscribe(s2);
		madness.subscribe(s3);
		madness.subscribe(s4);
		madness.subscribe(s5);
		
		madness.unsubscribe(s3);
		s1.subscribeTo(madness);
		s2.subscribeTo(madness);
		s3.subscribeTo(madness);
		s4.subscribeTo(madness);
		s5.subscribeTo(madness);
		
		madness.upload("How to Do Observer Design Pattern");
		
		
	}

}
