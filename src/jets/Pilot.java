package jets;

public class Pilot {
	private String name;
	

	public Pilot(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pilot [name = ");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
}
