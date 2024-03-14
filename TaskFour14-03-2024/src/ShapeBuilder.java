import java.util.ArrayList;

public class ShapeBuilder {


    //4.3 Lav en klasse ShapeBuilder, som kan holde en samling af Shapes i en ArrayList.
    // Lav en metode addShape(Shape s) som bruges til at tilføje nye Shape-objekter.

    private double radius;

    private double lenght;

    ArrayList<Shape> listOfShapes = new ArrayList<>();

    public void addShape(Shape form){

        listOfShapes.add(form);

    }

    public double getTotalArea() {
        double sum = 0;
        for(Shape form : listOfShapes){
            sum = sum + form.getArea();
        }
        return sum;
    }
}
