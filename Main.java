package k3;

public class Main {
	
	class Animal {

	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	
	class Dog extends Animal {
	   
	    void sound() {
	        System.out.println("Dog barks");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Creating an object of the child class
	        Dog myDog = new Dog();
	        myDog.sound(); // Calls the overridden method in Dog class

	        // Creating an object of the parent class
	        Animal myAnimal = new Animal();
	        myAnimal.sound(); // Calls the method in Animal class
	    }
	
	}
}
