/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

/**
 *
 * @author dpazolopez
 */
public class Modelo {
    String shapeType;
    float sideLength;
    float sideHeight;
    float rectangleArea;
    float baseLength;
    float radius;
    float circleArea;

    public Modelo() {
    }

    public Modelo(String shapeType, float sideLength, float sideHeight, float rectangleArea, float baseLength, float radius, float circleArea) {
        this.shapeType = shapeType;
        this.sideLength = sideLength;
        this.sideHeight = sideHeight;
        this.rectangleArea = rectangleArea;
        this.baseLength = baseLength;
        this.radius = radius;
        this.circleArea = circleArea;
    }

}
