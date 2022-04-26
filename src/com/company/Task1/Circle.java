package com.company.Task1;

import com.company.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Внутри Circle::draw() метод.");
    }
}
