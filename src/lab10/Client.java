package lab10;

import java.util.Scanner;

public class Client {
	public static void main( String[] args ) {
        Subject sub = new Subject();

        new DataRecorder (sub);
        new ForecastGenerator (sub);
        new DataAnalyzer (sub);
        new GUIUpdater (sub);
        new NewsGenerator(sub);
        new GraphsUpdater(sub);


        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan. nextFloat());
        }
    }

}
