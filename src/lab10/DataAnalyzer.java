package lab10;

public class DataAnalyzer extends Observer {
	public DataAnalyzer(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	@Override
	   public void update() {
		currentTemp=subject.getState();
	      System.out.println( "DataAnalyzer: Temperature "+currentTemp+" is being analyzed." ); 
	   }
}
