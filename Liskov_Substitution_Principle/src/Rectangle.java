public class Rectangle  extends Figure implements iCalculateTheArea{
   private int sideB;

   public Rectangle(int sideA, int sideB) {
      super(sideA);
      this.sideB = sideB;
   }

   public int getSideB() {
      return sideB;
   }

   public void setSideB(int sideB) {
      this.sideB = sideB;
   }

   @Override
   public int area() {
      return sideB - super.getSideA();
   }
   
}
