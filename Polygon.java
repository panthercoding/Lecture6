public class Polygon{

  //a polygon consists of many points that are vertices
  private Point[] vertices;

  public Polygon(Point[] points){
    vertices = points;
  }

  public double Perimeter(){
    double perimeter = 0; //summing up the sides
    for (int i = 0; i < vertices.length - 1; i++){
      //find distance between vertex i and vertex i + 1
      double sideLength = vertices[i].distanceTo(vertices[i+1]);
      perimeter += sideLength; //add to the perimeter
    }
    //adding the side between the last vertex and vertex 0
    perimeter += vertices[vertices.length - 1].distanceTo(vertices[0]);
    return(perimeter);
  }

  public void printVertices(){
    for (Point vertex: vertices){
      System.out.println(vertex.toString());
    }
  }

  /* IGNORE */
  /* uses the shoelace formula to calculate area */
  public double Area(){

    double area = 0;

    for (int i = 0; i < vertices.length - 1; i++){
      if (i == 0){
        area += vertices[i].getX() * (vertices[i+1].getY() - vertices[vertices.length - 1].getY());
      }
      else if (i == vertices.length - 1){
        area += vertices[i].getX() * (vertices[0].getY() - vertices[i-1].getY());
      }
      else{
        area += vertices[i].getX() * (vertices[i+1].getY() - vertices[i-1].getY());
      }
    }

    return(0.5 * Math.abs(area));
  }
}