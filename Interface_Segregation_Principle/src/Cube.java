public class Cube implements iCalculateTheArea, iCalculateTheVolume {
   private int edge;

   public Cube(int edge) {
      this.edge = edge;
   }

   public int getEdge() {
      return edge;
   }

   public void setEdge(int edge) {
      this.edge = edge;
   }
   @Override
   public int volume() {
      return edge * edge * edge;
   }

   @Override
   public double area() {
      return 6 * edge * edge;
   }

}
