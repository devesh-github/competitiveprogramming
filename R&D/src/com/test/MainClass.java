package com.test;

/*
String: string
boolean: true
boolean: false
int: 1
int: 2
int: 3
double: 4.12

 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {
  public static void main(String args[]) throws IOException {
    int i;
    double d;
    boolean b;
    String str;

    FileWriter fout = new FileWriter("test.txt");
    fout.write("string true false 1 2 3 4.12");
    fout.close();

    FileReader fin = new FileReader("Test.txt");

    Scanner src = new Scanner(fin);

     while (src.hasNext()) {
      if (src.hasNextInt()) {
        i = src.nextInt();
        System.out.println("int: " + i);
      } else if (src.hasNextDouble()) {
        d = src.nextDouble();
        System.out.println("double: " + d);
      } else if (src.hasNextBoolean()) {
        b = src.nextBoolean();
        System.out.println("boolean: " + b);
      } else {
        str = src.next();
        System.out.println("String: " + str);
      }
    }

    fin.close();
  }
}

