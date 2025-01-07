package com.example.project;

public class TriangleCollection {

    private Triangle[] collection;
  
    public TriangleCollection(int numTriangles, int startX, int startY) {
      this.collection = new Triangle[numTriangles];
      for (int i = 0; i < numTriangles; i++) {
        Point p1 = new Point(startX * -1, 0);
        Point p2 = new Point(0, startY);
        Point p3 = new Point(startX - i, 0);
        collection[i] = new Triangle(p1, p2, p3);
      }
    }
  
    public double totalPerimeter() {
      double sum = 0;
      for (Triangle triangle : collection) {
        sum += triangle.perimeter();
      }
      return sum;
    }

    public void shiftTriangles(int increment) {
      for (Triangle triangle : collection) {
        Point newP1 = new Point(triangle.getVertex1().getX() + increment, triangle.getVertex1().getY() + increment);
        Point newP2 = new Point(triangle.getVertex2().getX() + increment, triangle.getVertex2().getY() + increment);
        Point newP3 = new Point(triangle.getVertex3().getX() + increment, triangle.getVertex3().getY() + increment);
        triangle.setVertex1(newP1);
        triangle.setVertex2(newP2);
        triangle.setVertex3(newP3);
      }
    }
 
    public String triangleCollectionInfo() {
      String str = "";
      for (Triangle triangle : collection) {
        str += triangle.triangleInfo();
        str += "\n";
      }
      return str;
    }
  }
  
  