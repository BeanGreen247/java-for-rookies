class MyClass {
  public static void main(String[] args) {
    //int i = 0;
    //while (i <= 5) {
    //    System.out.println(i);
    //    i++;
    //}

    //int i = 0;
    //do {
    //    System.out.println(i);
    //    i++;
    //} while (i <= 5);

    //for (int i = 0; i <= 5; i++) {
    //    System.out.println(i);
    //}

    //for (int i = 0; i <= 10; i++) {
    //    System.out.println(i);
    //    if (i == 6) {
    //        break;
    //    }
    //}

    //for (int i = 0; i <= 10; i++) {
    //    if (i == 6) {
    //        continue;
    //    }
    //    System.out.println(i);
    //}

    //int i = 0;
    //do {
    //    System.out.println(i);
    //    i++;
    //    if (i == 6) {
    //        break;
    //    }
    //} while (i <= 10);

    //int i = 0;
    //do {
    //    if (i == 6) {
    //        break;
    //    }
    //   System.out.println(i);
    //    i++;
    //} while (i <= 10);

    String[] shoppinglist = {"apple", "bananas", "oranges", "kiwis"};
    int[] ammount = {1, 2, 3, 4};

    //shoppinglist[0] = "pineapple";

    //for (int i = 0; i <= 3; i++) {
    //    System.out.println(ammount[i]+" "+shoppinglist[i]);
    //}

    for (String i : shoppinglist) {
        System.out.println(i);
    }

  }
}