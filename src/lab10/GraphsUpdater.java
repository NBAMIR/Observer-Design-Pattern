package lab10;

public class GraphsUpdater extends Observer{
	public GraphsUpdater(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	@Override
	   public void update() {
		currentTemp=subject.getState();
	      System.out.println( "GraphsUpdater: Temperature "+currentTemp+" is updated on graph." ); 
	   }
}
