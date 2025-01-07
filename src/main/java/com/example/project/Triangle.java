package com.example.project;

public class Triangle {

    private Point[] vertices;

    public Triangle(Point p1, Point p2, Point p3) {
      this.vertices = new Point[] {p1, p2, p3};
    }

    public double perimeter() {
      double side1 = vertices[0].distanceTo(vertices[1]);
      double side2 = vertices[1].distanceTo(vertices[2]);
      double side3 = vertices[0].distanceTo(vertices[2]);
      return side1 + side2 + side3;
      
    }

    public Point[] getVertices() {
      return vertices;
    }

    public Point getVertex1() {
      return vertices[0];
    }

    public Point getVertex2() {
      return vertices[1];
    }

    public Point getVertex3() {
      return vertices[2];
    }

    public void setVertex1(Point newPoint) {
      vertices[0] = newPoint;
    }

    public void setVertex2(Point newPoint) {
      vertices[1] = newPoint;
    }
    public void setVertex3(Point newPoint) {
      vertices[2] = newPoint;
    }

    public String triangleInfo() {
      String str = "";
      str += "[";
      str += vertices[0].pointInfo() + ", ";
      str += vertices[1].pointInfo() + ", ";
      str += vertices[2].pointInfo();
      str += "]";
      return str;
    }
  }
  