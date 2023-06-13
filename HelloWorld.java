package fundamentals;

public class HelloWorld {

	public static void main (String[] args) { //main function tells Java where to start executing the program
	System.out.println("Hello World!");

	Person person1 = new Person("Dharam", 29); //creating a Person object
	//(Type of object) (name of object) = "new" keyword is used to create an Object and tell it to call the Person object 

	System.out.println(person1);

	// greet(person1); //or
	person1.greet();


	Person person2 = new Person("Michal", 38); 

	System.out.println(person1.equals(person2));

	System.out.println(person1.equals("Dharam"));

	System.out.println(person1.equals(new Person("Dharam", 29)));


	System.out.println(person1.equals(null));

	System.out.println(person1.equals(new Person(null, 29)));

// assertions in a primitive way ^^
	}

}
