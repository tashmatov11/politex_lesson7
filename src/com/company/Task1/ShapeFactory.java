package com.company.Task1;

import com.company.Rectangle;
import com.company.Shape;
import com.company.Square;

public class ShapeFactory {
    //используйте метод getShape, чтобы получить объект типа shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
