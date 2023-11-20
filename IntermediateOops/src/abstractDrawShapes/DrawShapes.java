package abstractDrawShapes;
abstract class Shape {
    abstract void draw();
}
class Line extends Shape {
    @Override
    void draw(){
        System.out.println("Drawing a Line");
    }
}
class Rectangle extends Shape {
    @Override
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
class Cube extends Shape {
    @Override
    void draw(){
        System.out.println("Drawing a Cube");
    }
}
public class DrawShapes {
    public static void main(String[] args) {
        Shape line = new Line();
        Shape rectangle = new Rectangle();
        Shape cube = new Cube();

        drawShape(line);
        drawShape(rectangle);
        drawShape(cube);


        }
    public static void drawShape(Shape shape){
        shape.draw();
    }
}
