package jets;

public class Jets extends Hangar {
	private double topSpeedMPH, price, range, topSpeedMach;
	private String name;
	
	
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
	public void mphToMach(double topSpeedMPH) {
		double result;
		result = topSpeedMPH * 0.001303;
		this.topSpeedMach = result;
	}
	public void machToMPH(double topSpeedMach) {
		double result;
		result = topSpeedMach / 0.001303;
		this.topSpeedMPH = result;
	}
	
	
}
