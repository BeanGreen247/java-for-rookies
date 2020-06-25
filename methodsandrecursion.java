class MyClass {
  //static void myVoid() {
  //  System.out.println("This text is inside myVoid...");
  //  for (int i = 1; i <= 4; i++) {
  //      System.out.println(i);
  //  }
  // }

  //static void myVoid(String name) {
  //  System.out.println("Hi there " + name);
  //}

  //static void myVoid(String name, int age) {
  //  System.out.println("His name is " + name + " and his age is " + age);
  //}

  //static int myRec(int num) {
  //  if (num > 0) {
  //      return num + myRec(num - 1);
  //  } else {
  //      return 0;
  //  }
  //}

  static int myRec(int start,int end) {
    if (end > start) {
        return end + myRec(start, end - 1);
    } else {
        return end;
    }
  }

  public static void main(String[] args) {
    //myVoid();
    
    //myVoid("John");
    
    //myVoid("John",24);
    //myVoid("Luke",21);

    //int result = myRec(10);
    //System.out.println(result);

    int result = myRec(5, 10);
    System.out.println(result);
  }
}