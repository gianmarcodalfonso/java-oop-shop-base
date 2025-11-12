package org.lessons.java.shop;

public class Main {
  public static void main(String[] args) {
    Product libro_1 = new Product("Odissea", "Vuole tornare a casa", 11.99f);

    libro_1.showPrice();
    libro_1.showFullName();
    libro_1.showTotalPrice();

  }

}
