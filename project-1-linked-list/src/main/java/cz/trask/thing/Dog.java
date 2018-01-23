package cz.trask.thing;

/**
 * POJO dog
 */
public class Dog {

	private String name;

	public Dog(String name) {
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
		return "Dog{" + "name='" + name + '\'' + '}';
	}
}