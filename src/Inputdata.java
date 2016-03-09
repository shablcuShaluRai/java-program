import java.io.*;

class Personn {

	private String name;
	private int age;

	public void accept() throws IOException {
  //InputStreamReader ir= new InputStreamReader(System.in);
	//	BufferedReader br = new BufferedReader(ir);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name:");
		name = br.readLine();
		System.out.println("enter age:");
		age = Integer.parseInt(br.readLine());

	}

	public void check() {
		if (age < 30)
			System.out.println(name + " is young");
		else if (age <= 50)
			System.out.println(name + " is middle age");
		else
			System.out.println(name + " is old");

	}

}

public class Inputdata {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Personn person1=new Personn();
		person1.accept();
		person1.check();

	}

}
