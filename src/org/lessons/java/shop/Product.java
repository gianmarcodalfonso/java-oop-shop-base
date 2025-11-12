package org.lessons.java.shop;
import java.util.Random;

public class Product {
  //attributi
  int code;
  String name;
  String description;
  float price;
  int iva;

  // costruttore
  Product(String name, String description, float price) {
    // genero codice random
    java.util.Random r = new Random();
    int codeMaxLength = 9999999;
    this.code = r.nextInt(codeMaxLength);

    // assegno i valori tramite il costruttore
    this.name = name;
    this.description = description;
    this.price = price;
  }

  // metodi
  // espongo prezzo base
  void showPrice() {
    System.out.println(this.price);
  }

  // espongo prezzo comprensivo di iva
  void showTotalPrice() {
    float totalPrice = this.price + (this.price * (this.iva / 100));
    System.out.println(totalPrice);
  }

  // espongo nome esteso
  void showFullName() {
    System.out.println(this.code + "-" + this.name);
  }


}
