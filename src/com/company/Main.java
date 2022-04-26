package com.company;

import com.company.Task1.ShapeFactory;
import com.company.Task2.AbstractFactory;
import com.company.Task2.FactoryProducer;

public class Main {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        //Task 1
        System.out.println(ANSI_YELLOW + "Task 1" + ANSI_RESET);
        ShapeFactory shapeFactory1 = new ShapeFactory();

        Shape shape1 = shapeFactory1.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory1.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory1.getShape("SQUARE");
        shape3.draw();

        //Task 2
        System.out.println(ANSI_YELLOW + "\nTask 2" + ANSI_RESET);
        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(false);

        Shape shape4 = shapeFactory2.getShape("RECTANGLE");
        shape4.draw();

        Shape shape5 = shapeFactory2.getShape("SQUARE");
        shape5.draw();

        AbstractFactory shapeFactory3 = FactoryProducer.getFactory(true);

        Shape shape6 = shapeFactory3.getShape("RECTANGLE");
        shape6.draw();

        Shape shape7 = shapeFactory3.getShape("SQUARE");
        shape7.draw();


    }
}
