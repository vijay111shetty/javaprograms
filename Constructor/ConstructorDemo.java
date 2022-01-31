package Constructor;

public class ConstructorDemo {
	//will not return any values
	//name of the constructor is name of the class only
	//Constructors in Java
	//A constructor is a special method that is used to initialize an object.Every class has a constructor,if we don't explicitly declare a constructor for any java class the compiler builds a default constructor for that class. A constructor does not have any return type.

	//A constructor has same name as the class in which it resides. Constructor in Java can not be abstract, static, final or synchronized. These modifiers are not allowed for constructor.
	public ConstructorDemo()
	{
		System.out.println("I am the constructor");
		System.out.println("I will be called automatically");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo con=new ConstructorDemo();

	}

}
