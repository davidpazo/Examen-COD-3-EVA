package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian editado por dpazolopez ;)
 */
public class Superficies {

    private static Scanner sc;

    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista obj = new Vista();
        obj.Introducir(mod);
        //calcula area del cuadrado
        if (mod.getShapeType().equalsIgnoreCase("Cuadrado")) {
            //add area calculations for square
            obj.Cuadrado(mod);

            mod.setSquareArea(mod.getSideLength() * mod.getSideLength());
            obj.impr(mod.getSquareArea());

        //calcula area del rectangulo
        }
        if (mod.getShapeType().equalsIgnoreCase("Rectangulo")) {
            //add area calculations for rectangle here
            obj.Rectangulo(mod);

            mod.setRectangleArea(mod.getSideLength() * mod.getSideHeight());
            obj.impr(mod.getRectangleArea());
        //calcular area del triangulo
        }
        if (mod.getShapeType().equalsIgnoreCase("Triangulo")) {
            //add area calculations for triangle here
            obj.Triangulo(mod);

            mod.setTriangleArea((float) (0.5 * mod.getBaseLength() * mod.getHeight()));
            obj.impr(mod.getTriangleArea());
        //calcular area del circulo
        }
        if (mod.getShapeType().equalsIgnoreCase("Circulo")) {
            //add area calculations for a circle here
            obj.Circulo(mod);

            mod.setCircleArea((float) (3.141592 * mod.getRadius() * mod.getRadius()));
            obj.impr(mod.getCircleArea());

        }
    }
}
