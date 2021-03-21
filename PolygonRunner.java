public class PolygonRunner{

  public static void main(String[] args){

    Point p1 = new Point(2,0);
    Point p2 = new Point(0,-2);
    Point p3 = new Point(-2,0);
    Point p4 = new Point(0,2);

    Point[] points = {p1,p2,p3,p4};
    Polygon square = new Polygon(points);
    System.out.println("Perimeter: " + square.Perimeter());
    System.out.println("Area: " + square.Area());
    square.printVertices();
  }
}