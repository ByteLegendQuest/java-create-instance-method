package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        Cat black = new Cat();
        black.name = "Black";
        black.sayName(name);

        Cat white = new Cat();
        white.name = "White";
        white.sayName(name);
    }

    // Print my `name` to standard output
    public void sayName(String name) {

        System.out.println(name);
    }
}
