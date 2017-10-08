package jets;

public class Jets extends Hangar {
	private double topSpeed, price, range;
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

	public Jets(double topSpeed, double price, double range, String name) {
		super();
		this.topSpeed = topSpeed;
		this.price = price;
		this.range = range;
		this.name = name;
	}

	public double getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
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
	
	
	
}
