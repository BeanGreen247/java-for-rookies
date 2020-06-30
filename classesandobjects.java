class MyClass {
    //int x = 5;
    
    //int x = 5;
    
    //int x = 5;
    
    //String firstName = "Deez";
    //String lastName = "Nuts";
    //int age = 25;

    int modelYear;
    String modelName;
    public MyClass(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    //static void myMethod() {
    //    System.out.println("This text is from myMethod...");
    //}
  public static void main(String[] args) {
    //MyClass myObj = new MyClass();
    //System.out.println(myObj.x);

    //MyClass myObj = new MyClass();
    //MyClass myObj1 = new MyClass();
    //System.out.println(myObj.x);
    //System.out.println(myObj1.x);

    //MyClass myObj = new MyClass();
    //MyClass myObj1 = new MyClass();
    //myObj1.x = myObj1.x + 5;
    //System.out.println(myObj.x);
    //System.out.println(myObj1.x);

    //MyClass person = new MyClass();
    //System.out.println("Name: " + person.firstName + " " + person.lastName);
    //System.out.println("Age: " + person.age);

    MyClass car = new MyClass(1969, "Mustang");
    System.out.println(car.modelName + " " + car.modelYear);

    //myMethod();
  }
}