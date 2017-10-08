package jets;

public class Hangar {
	private Jets fleet[] = new Jets[5];
	
	public void findFastest() {
		double fastest = 0.0;
		int index = 0;
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i].getTopSpeedMach() > fastest) {
				fastest = fleet[i].getTopSpeedMach();
				index = i;
			}
		}
		System.out.println("This is the fastest jet in the fleet: ");
		System.out.println(fleet[index]);
	}
	public void findLongestRange() {
		double longestRange = 0.0;
		int index = 0;
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i].getRange() > longestRange) {
				longestRange = fleet[i].getRange();
				index = i;
			}
		}
		System.out.println("This is the jet with the longest range: ");
		System.out.println(fleet[index]);
	}
}
