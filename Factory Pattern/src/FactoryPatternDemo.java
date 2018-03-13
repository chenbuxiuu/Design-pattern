// package src;
public class FactoryPatternDemo {

   public static void main(String[] args) {
      Rectangle rect = ShapeFactory.getClass(Rectangle.class);
      rect.draw();

      Circle cir = ShapeFactory.getClass(Circle.class);
      cir.draw();
   }
}