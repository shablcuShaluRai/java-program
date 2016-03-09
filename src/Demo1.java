

class Person2 {
	//private is a access specifier (an access specifier is a keyword that specifies how to access the member 
	//of a class or itself)private members of a class or not accessible anywhere in the class .they are accessible
	//only within the class by the method of the class.
	
	 private String name;
	private int age;

	Person2() {
		// there is no parameter in this constructor is called default
		// constructor.

		name = "shalu";
		age = 20;

	}

	Person2(String s, int i) {
		// if constructor will have one or more than one parameter is called
		// parameterized constructor
		// parameterized constructor is useful to initialize the each object
		// with different data.

		name = s;
		age = i;

	}

	void talk() {
		System.out.println("my name is: " + name + "\n my age is " + age);
	}

}

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person2 person = new Person2();
		person.talk();

		Person2 personp = new Person2("sahil", 18);// pass the value through
													// parameter.
		personp.talk();
	}

}
