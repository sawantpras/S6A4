import java.util.*;

//create user defined exception class which extends exception class
class MyException extends Exception {
	MyException() {
	}

	MyException(String s) {
		super(s);
	}
}

class ExceptionDemo {

	int age;

	public void myMethod() throws MyException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		age = s.nextInt();

		// we check age is negative or not?
		if (age < 0) {
			// if age is negative generate exception
			throw new MyException("NegativeAgeException");
		} else
			System.out.println("your age is " + age);
	}

	public static void main(String args[]) {
		try {
			ExceptionDemo e = new ExceptionDemo();
			e.myMethod();
		} catch (MyException e) {
			// handle the exception
			System.out.println("NegativeAgeException");
		}
	}
}