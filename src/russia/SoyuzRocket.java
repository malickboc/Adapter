package russia;

public class SoyuzRocket implements RURocket {

	@Override
	public void terminate() {
		System.out.println("Aborting RU...");
	}

	@Override
	public void takeOff() {
		System.out.println("Launching RU...");
	}

}
