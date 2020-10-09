import russia.SoyuzRocket;
import usa.NasaRocket;

/**
 * Entry point for the application.
 * 
 * @author ripke1tj
 *
 */
public class Main {

	public static void main(String[] args) {

		RocketControlPanel missionControl = new RocketControlPanel();
		missionControl.addRocket(new NasaRocket());
		missionControl.addRocket(new RocketAdapter(new SoyuzRocket()));
	
		missionControl.takeOff();
		missionControl.abort();
	}

}
