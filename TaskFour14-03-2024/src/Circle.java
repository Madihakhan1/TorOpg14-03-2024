public class Circle implements Shape {


    //4.2 Lav to klasser, Circle og Square, som implementerer interfacet.
    // Lad de to klasser tage en double som parameter i konstruktøren.
    // Denne double repræsenterer henholdsvis radius og længde på en cirkel og et kvadrat.
    // Metoderne getArea() skal returnere cirklens eller kvadratets areal.
    // Arealet for en cirkel er pi * r² (altså 3,14 * (radius * radius)).
    // Test i en main, at getArea()-metoderne virker som du forventer.
private double radius;

   public Circle(double radius) {
      this.radius = radius;
   }

   @Override
   public double getArea() {
      return (radius*radius) * 3.14;
   }


}
