
public class Dog {
String name;
int size;

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

public void eat() {}
public void chaseCat() {}

}


class TestDog{
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark(3);
		dog1.name = "Bob";
		
		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		myDogs[0].name = "Bart";
		myDogs[1].name = "Jordan";
		
		myDogs[0].size = 90;
		myDogs[1].size = 16;
		
		System.out.println("last dog's name is");
		System.out.println(myDogs[2].name);
		
		
	}

}
