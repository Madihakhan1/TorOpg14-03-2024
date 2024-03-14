public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.14);
        Square square = new Square(5, 2);

        System.out.println(circle.getArea());

        ShapeBuilder shapeBuilder = new ShapeBuilder();

        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        System.out.println(shapeBuilder.getTotalArea());






    }
}