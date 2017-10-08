package jets;

public class Jets extends Hangar {
	private double topSpeedMPH, price, range, topSpeedMach;
	private String name;
	private Pilot pilot;
	
	
	public Jets() {
		super();
	}
	
	public Jets(String name) {
		super();
		this.name = name;
	}

	public Jets(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public Jets(double topSpeedMPH, double price, double range, String name) {
		super();
		this.topSpeedMPH = topSpeedMPH;
		this.price = price;
		this.range = range;
		this.name = name;
		this.topSpeedMach = mphToMach(topSpeedMPH);
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public double getTopSpeedMach() {
		return topSpeedMach;
	}

	public void setTopSpeedMach(double topSpeedMach) {
		this.topSpeedMach = topSpeedMach;
	}

	public double getTopSpeedMPH() {
		return topSpeedMPH;
	}
	public void setTopSpeedMPH(double topSpeed) {
		this.topSpeedMPH = topSpeed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double mphToMach(double topSpeedMPH) {
		return topSpeedMPH * 0.001303;
	}
	public double machToMPH(double topSpeedMach) {
		return topSpeedMach / 0.001303;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jets [topSpeedMPH = ");
		builder.append(topSpeedMPH);
		builder.append(", price (in millions) = ");
		builder.append(price);
		builder.append(", range = ");
		builder.append(range);
		builder.append(", topSpeedMach = ");
		builder.append(topSpeedMach);
		builder.append(", name = ");
		builder.append(name);
		builder.append(", pilot = ");
		builder.append(pilot);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
