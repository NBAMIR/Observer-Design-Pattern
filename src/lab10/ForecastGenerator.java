package lab10;

public class ForecastGenerator extends Observer{
	public ForecastGenerator(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	@Override
	   public void update() {
		currentTemp=subject.getState();
	      System.out.println( "ForecastGenerator: Forecast for current temperature "+currentTemp+" is being generated." ); 
	   }
}
