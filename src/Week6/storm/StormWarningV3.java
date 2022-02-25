package Week6.storm;

public class StormWarningV3 {
	//instance variables
	private StromInterface theStorm;

	//constructor
	public StormWarningV3(StromInterface storm) {
		theStorm = storm;

	}

	//other methods
	public double predictDamageLevel() {
			return theStorm.predictDamageInDollars();
	}

	//toString
	public String toString() {
		return "The " + theStorm + " may have damages of " + predictDamageLevel();
	}





}
