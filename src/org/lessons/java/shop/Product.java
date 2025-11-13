package org.lessons.java.shop;
import java.util.Random;

public class Product {
  //attributi
  private int code;
  private String name;
  private String description;
  private float price;
  private float iva;

  // getter

  public int getCode(){
      return this.code;
  }

  public String getName(){
    return this.name;
  }
  
  public String getdescritption(){
    return this.description;
  }

  public float getprice(){
    return this.price;
  }
  
  public float getIva(){
    return this.iva;
  }


  // costruttore
  public Product(String name, String description, float price) {
    // genero codice random
    java.util.Random r = new Random();
    int codeMaxLength = 9999999;
    this.code = r.nextInt(codeMaxLength);

    // assegno i valori tramite il costruttore
    this.name = name;
    this.description = description;
    this.price = price;
    this.iva = 0.25f;
  }

  // metodi
  // espongo prezzo base
  void showPrice() {
    System.out.println(this.price);
  }

  // espongo prezzo comprensivo di iva
  void showTotalPrice() {
    float totalPrice = this.price + (this.price * this.iva);
    System.out.println(totalPrice);
  }

  // espongo nome esteso
  void showFullName() {
    System.out.println(this.code + "-" + this.name);
  }


}
