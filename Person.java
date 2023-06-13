package Users/dharamshah/Development/Fundamentals;

public class Person { 						//to create an object, first need to create a class
	
	String name; 							//have to say what the object will look like, it has two values; name and age
	int age;

	public Person(String name, int age) {	//Java has something called the Constructor which is a special method which shares the name of it's class
		this.name = name;					//when we create an object we want to go to that object's name and set it equal to value we passed into our method (the constructor in this case).
		this.age = age;
	}

}
