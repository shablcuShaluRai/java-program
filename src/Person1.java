class Person {
	String name;
	int age;

	Person() {
		// constructor name is the same as the class name
		// if nothing is passed in the parameter is called default constructor.
		// constructor use for initialize the instance variable
		// constructor does not return value ,not even void.

		name = "sahil";
		age = 20;
	}

	void talk() {

		// talk() is a method is not return any value .
		System.out.println("my name is:" + name + "\nwmy age is :" + age);

	}
}

public class Person1 {

	public static void main(String[] args) {

		Person sahil = new Person();
		sahil.talk();

	}

}
