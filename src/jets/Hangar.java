package jets;

public class Hangar extends Engine{
	private Jets fleet[] = new Jets[10];
	private String name;
	
	
	public Hangar() {
		super();
	}
	
	public Hangar(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setFleet(int idx, double speed, double price, double range, String model) {
		this.fleet[idx] = new Jets(speed, price, range, model);
	}

	public void addJet() {
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] == null) {
				System.out.println("Enter the model: ");
				String model = kb.nextLine();
				System.out.println("Enter the range: ");
				double range = kb.nextDouble();
				System.out.println("Enter the price: ");
				double price = kb.nextDouble();
				System.out.println("Enter the top speed in MPH: ");
				double speed = kb.nextDouble();
				fleet[i] = new Jets(speed, price, range, model);
			}
			else if (fleet[4] != null) {
				System.out.println("This hangar is full!");
			}
		}
	}
	public void listFleet() {
		System.out.println("Fleet " + this.name + ":");
		for (Jets jets : fleet) {
			System.out.println(jets);
		}
	}
	
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
