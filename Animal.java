public class Animal {
	private String name;
	private int legs;
	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public int getLegs() {
		return legs;
	}

	@Override
	public String toString() {
		return name + " has " + legs + " legs";
	}
}
