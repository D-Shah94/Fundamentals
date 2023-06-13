package fundamentals;

public class Person { 						//to create an object, first need to create a class
	
	private String name; 							//have to say what the object will look like, it has two values; name and age
	private int age;

	public Person(String personName, int personAge) {	//Java has something called the Constructor which is a special method which shares the name of it's class
		this.name = personName;							//when we create an object we want to go to that object's name and set it equal to value we passed into our method (the constructor in this case).
		this.age = personAge;							//convention is to keep the naming the same, but this is just for understanding of the concept
	}

	void greet() {
		System.out.println("Hello my name is " + name);
	}

	@Override //This overrides the default toString method with our own.
	public String toString() {
		return name + " " + age;
	}

	@Override //The parent class object also has an equals method but we're providing our own
	public boolean equals(Object object) { 	//the equals method that we're overriding compares Objects 
											//not just the specific Person class that we've created
		if (object == this) { //same reference then true
			return true;

		} else if (object == null) {
			return false;
		} else if (object.getClass() != this.getClass()) {
			return false;

		} else if ((((Person)object).name.equals(this.name)) && (((Person)object).age == this.age)) {
			return true;
		// } else if (((Person)object).age.equals(this.age)) {
		// 	return true;
		} else {
			return false;
		}
	}
}



// make objects immutable so they don't change, do this as much as you can
// public, protected, default, private, package levels, - access  - READ UP ON THIS!!!
// javac fundamentals/*.java
// static -  this method is not specific to any particular instance of person, it is a method on the class
// create a static method for class Person
// Add an extra case to the equals method - e.g. line 25, is this object
// == - compares references, equals method - compares values. (down to the individual engineer to implement this)
// primitives
// !!!!DO THIS!!! - Change the equals method implemention so that this -> System.out.println(person1.equals(new Person(null, 29)));
// gives the correct result
/*  ▶ java fundamentals.HelloWorld
Hello World!
Dharam 29
Hello my name is Dharam
false
false
true
false
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "<parameter1>.name" is null
	at fundamentals.Person.equals(Person.java:33)
	at fundamentals.HelloWorld.main(HelloWorld.java:28)
implemented a custom equals method
need to custom hashCode method - (both are overriden if one is overriden) - if the equals method returns true then the hashCode should also be the same
!!!hashCode READ UP!!!

	*/