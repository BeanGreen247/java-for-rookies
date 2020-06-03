import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
	Scanner userInput1 = new Scanner(System.in);
	
	//text input and output
	//String userText = userInput.nextLine();
	//System.out.println(userText);
	
	//number input and output
	//int userInt = userInput.nextInt();
	//double userDouble = userInput.nextDouble();
	//System.out.println(userInt);
	//System.out.println(userDouble);
	
	System.out.println("Pick an action:" + "\n1-Enter your name" + "\n2-Enter your age" + "\nYour pick:");
	int menu = userInput.nextInt();
	
	switch (menu) {
		case 1:
			System.out.print("Hi. Please enter your name: ");
			String name = userInput1.nextLine();
			System.out.println("Hi there " + name + ". Nice to meet you.");
			break;
		case 2:
			System.out.print("Could you please enter your age: ");
			int age = userInput.nextInt();
			if (age >= 13 && age < 18)
			{
				System.out.println("You are a teen.");
			}
			else if (age >= 18 && age < 80)
			{
				System.out.println("You are an adult.");
			}
			else if (age >= 80)
			{
				System.out.println("You are part of the elderly.");
			}
			else 
			{
				System.out.println("You are too young to use this app.");
			}
			break;
		default:
			System.out.println("No option picked ;_;");
	}
	
  }
}