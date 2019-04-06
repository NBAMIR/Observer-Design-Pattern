package lab10;

public class DataRecorder extends Observer{
	
	public DataRecorder(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	@Override
	   public void update() {
		currentTemp=subject.getState();
	      System.out.println( "DataRecorder: Temperature "+currentTemp+" has been written in local database." ); 
	   }
}
