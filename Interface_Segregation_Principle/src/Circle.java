public class Circle implements iCalculateTheArea{
   private int radius;

   public Circle(int radius) {

      this.radius = radius;
   }


   @Override
   public double area() {
      return 2 * 3.14 * radius;
   }
   

}
