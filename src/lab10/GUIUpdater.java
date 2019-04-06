package lab10;

public class GUIUpdater extends Observer {
	public GUIUpdater(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	@Override
	   public void update() {
		currentTemp=subject.getState();
	      System.out.println( "GUIUpdater: Temperature "+currentTemp+" is updated on GUI." ); 
	   }
}
