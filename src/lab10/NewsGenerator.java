package lab10;

public class NewsGenerator extends Observer {
	public NewsGenerator (Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	@Override
	   public void update() {
		currentTemp=subject.getState();
	      System.out.println( "NewsGenerator : Temperature "+currentTemp+" is updated on the news." ); 
	   }
}
