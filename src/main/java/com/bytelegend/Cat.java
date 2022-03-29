package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        Cat black = new Cat();
        black.name = "Black";
        black.sayName();

        Cat white = new Cat();
        white.name = "White";
        white.sayName();
    }

    public void sayName() {
        System.out.print(name);
    }
}
