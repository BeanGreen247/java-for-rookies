//class MyClass {
    ////encapsulation class section start
    //private String name;

    //public String getName() {
    //    return name;
    //}

    //public void setName(String newName) {
    //    this.name = newName;
    //}
    ////encapsulation class section end

 // public static void main(String[] args) {
    ////encapsulation main section start
    //MyClass person = new MyClass();
    //person.setName("Deez Nuts");
    //System.out.println(person.getName());
    ////encapsulation main section end

    ////inheritance main section start

    ////inheritance main section end
//  }
//}

////inheritance class section start
//class Car extends Vehicle {
    ////inheritance attribute section start
//    private String modelName = "Mustang";
    ////inheritance attribute section end

//    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.honk();
//        System.out.println(myCar.brand + " " + myCar.modelName);
//    }
//}

//class Vehicle {
//    protected String brand = "Ford";
//    public void honk() {
//        System.out.println("Honkers");
//    }
//}
////inheritance class section end

////polymorphism class section start
//class mainClass {
//    public static void main(String[] args) {
//        Animal myAnimal = new Animal(); 
//        Animal myPig = new Pig();
//       Animal myDog = new Dog();
//        myAnimal.animalSound();
//        myPig.animalSound();
//       myDog.animalSound();
//    }
//}

//class Animal {
//  public void animalSound() {
//    System.out.println("The animal makes a sound");
//  }
//}

//class Pig extends Animal {
//  public void animalSound() {
//    System.out.println("The pig says: wee wee");
// }
//}

//class Dog extends Animal {
//  public void animalSound() {
//   System.out.println("The dog says: bow wow");
//  }
//}
////polymorphism class section end

////abstraction class section start
class mainClass {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
////abstraction class section end