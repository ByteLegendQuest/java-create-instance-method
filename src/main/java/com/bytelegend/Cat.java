package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        Cat black = new Cat();
        black.name = "Black";
        black.sayName();

        Cat white = new Cat();
        white.name = "666";
        white.sayName();
    }

    // Print my `name` to standard output
    public void sayName() {}
}
