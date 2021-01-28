
public class Dog {
	private String name;
	private int size;

public void bark(int numOfBarks) {
	while(numOfBarks > 0) {
		if(this.size >= 60) {
			System.out.println("WOOOF!");
		} else if(this.size > 14 && this.size < 60) {
			System.out.println("Ruff! Ruff!");
		} else {
		System.out.println("yip! yip!");
		numOfBarks = numOfBarks - 1;
	}	
	}
	
	
	
	
}

	public void setSize(int size) {
	this.size = size;
}
	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void eat() {
	}

	public void chaseCat() {
	}

}

class TestDog {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark(3);
		dog1.setSize(20);

		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		myDogs[0].setName("Bike");
		myDogs[1].setName("Olaf");

		myDogs[0].setSize(90);
		myDogs[1].setSize(20);

		System.out.println("last dog's name is");
		System.out.println(myDogs[2].getName());

	}

}
