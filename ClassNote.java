// This is a class - it serves as a container
public class ClassNote {
	// Notice the class name starts with uppercase letter
	// If there are multiple words in the class name, each word is capitalized

	// This is the main method --- it is nested inside the class

	public static void main(String[] args) {

		// Notice that the main method starts with m lowercase

		// This is a Java statement
		// Removing the ; will give syntax (language) error.

		// sysout + ctrl + space - Shortcut to write System.out.println();

		System.out.println("Shopping List:\n\tTomatoes \n\tPotatoes \n\tApple  \n\tOrganic \"Cage-Free\" eggs \n\tCranberry");

		//declaring  an int(an integer variable)
		int age;
		// assign value to variable age
		age=28;

		int num= 100;
		// declare + assign on the same line(initialization)
		// cannot re declare the age 
		System.out.println(num);

		int count;
		count=30;
		count=45;
		System.out.println(count);

		int speedLimit=25;
		System.out.println(speedLimit);
		System.out.println(SpeedLimit);
		System.out.println(speedlimit);


		// Shortcut for comments in Eclipse --> ctrl + / OR ctrl + 7
		//				System.out.println("Hello Yoll Students! Welcome!");
		//				
		//				System.out.println("Let's learn Java together!");


		// print --> prints then stops at the end of the line
		//				System.out.print("Cat");
		//				System.out.print("Dog");
		//				System.out.println("Horse");

		// println --> prints then moves to the next line
		System.out.print("Cat");
		System.out.println(" Dog");
		System.out.print("Horse");



		// \n is called a escape character for new line
		// \n will create a new line at the point it shows
		System.out.println("\nCatDog"); 
		// 1- \n will create a new line
		// 2- CatDog will be written on the same line as single word
		// 3- The cursor will go to a new line because of the println



		System.out.println(" \"For the things we have to learn before we can do them, we learn by doing them\" — Aristotle");


		// Escape character is indicated by \
		// \n --> new line
		// \" --> " inside a statement
		// \t --> tab
		// \\ --> single backslash
		System.out.println("C:\\Users\\hamzaas\\Desktop\\Cohort7");

		// Task 1A
		System.out.println("To-do List:");
		System.out.println("\tWake Up");
		System.out.println("\tExercise");
		System.out.println("\tHave Breakfast");
		System.out.println("\tStudy");
		System.out.print("\tGo to Class");


		// Variables

		int x = 10;

		System.out.println(x); // It will print the value of x

		System.out.println("x"); // It will print the letter x to the screen


		int a = 4;
		int b = 12;
		System.out.println(a + b);

		// Declaring an int (an integer variable)
		int age;

		// Assign a value to the variable age
		age = 28;

		// Declare + assign on the same line (Initialization)
		//				int age = 28;
		int num = 10000;
		int x = 5;


		System.out.println(age);


		// Declaring an int (an integer variable)
		int age;

		// Assign a value to the variable age
		age = 28;

		// Declare + assign on the same line (Initialization)
		//				int age = 28;
		int num = 10000;
		int x = 5;


		System.out.println(age);

		
		int count; // Declaring a variable count

		// This will give an error because count is not initialized
		// System.out.println(count); 

		count = 30;
		System.out.println(count);

		count = 45;
		System.out.println(count);


		// Naming your variables

		int x;
		int numOfCars;
		int x2;
		int num_planes;
		int num$Amount;
		int value_of_x;

		int __sharedValue;

		int $val;

		int 5values; // Cannot start with a number

		int _5;



		// camelCase Naming
		int numOfStudents;

		// This is a different variable from the one above because of o in of
		int numofStudents;


		// It will not work because speedLimit is not declared	

		//				speedLimit = 25;
		//				
		//				System.out.println(speedLimit);


		int speedLimit = 25;
		// SpeedLimit is not declared and it is not the same as speedLimit
		// S is capital
		//				System.out.println(SpeedLimit); 

		// Same as abobe because l is lowercase
		System.out.println(speedlimit);

		// boolean data type
		boolean isHungry = true;
		boolean isThirsty = false;

		System.out.println(isHungry);
		System.out.println(isThirsty);

		// Default value of false works with objects in the future
		// You will still need to assign a value to your boolean variable to use it
		boolean isEmpty;
		System.out.println(isEmpty);

		// boolean variables do not have to start with is
		boolean winner = true;

		// You can't assign any other data type to boolean variables
		//				boolean isBusy = 0;


		boolean isClear = false;
		System.out.println(isClear); // false
		isClear = true;
		System.out.println(isClear); // true


// bytes -128 --> +127 ---> Uses 1 byte = 8 bits in the memory

		//byte num = -128;

		//task 3
		boolean x = false;
		System.out.println(x);
		x=true;
		System.out.println(x);

		// task 4
		byte value=-3;
		System.out.println(value);

		// short task 5 
		short number=680;
		System.out.println(number);
		//short number=55000;
		//System.out.println(number);
		//short number=-39000;
		//System.out.println(number);		
		//	System.out.println(num);


// Short (-32768 to 32767) ---> uses 2 bytes = 16 bits in the memory
		//				short number = 32500;
		//				
		//				System.out.println(number);

// int ---> uses 4 bytes = 32 bits in the memory
		int num = 65166543;

		int apple = 5;
		int strawberry = apple;
		System.out.println(strawberry);
		System.out.println(apple);


		// task 6
		int bestValue= 680;
		System.out.println(bestValue);


		// Swapping two numbers
		int a = 10;
		int b = 20;

		// swap the values in a and b
		// a should have the value of b
		// b should have the value of a

		// Answer 1: Use a third int
		int c = a; // c = 10
		a = b; // a = 20
		b = c; // b = 10

		//	// Answer 2: Without using a third variable
		//a = a + b; // a = 30
		//b = a - b; // b = 10
		//a = a - b; // a = 20


		System.out.println(a);
		System.out.println(b);

// Long --> 64 bits = 8 Bytes
		// By default Java treats integer numbers as int
		long number = 1565464164242122L; // add l or L to teach Java that this is a long number
		System.out.println(number);

		// Errors: Again, because integer numbers by default are int
		//				byte y = 150;
		//				short x = 1505454;

// float uses 4 bytes in the memeory = 32 bits
		// Java treats any floating point number as a double by default
		float num = -13.5F; // add f or F to teach java that it is a float - f stands for float
		//Task 7
		float number = 640.45f;
		System.out.println(number);// double uses 8 bytes in the memeory = 64 bits
		double number = -640.45; // no need to add d or D
		double num = 34; // we could store integer in float 
		System.out.println(num);

		// task 8
		double num3= 34;
		System.out.println(num3);


//char// has to be one /single char
		char letter = 'k'; // Single quotes not double " like Strings
		System.out.println(letter);

		// char lett = 'ab'; // error because it is not a character

		char special = '\n'; // Escape characters are treated as a single character

		System.out.print("Hello");
		System.out.print(special);
		System.out.print("Yollers!");

		char backSlash = '\\'; 

// Strings are objects
		int x = 10;

		System.out.println("Welcome to Yoll Academy!"); // String literal

		// String variable
		String name = "Yoll Academy!";


		System.out.println(name);


	}

}
