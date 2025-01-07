package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    public double distanceTo(Point other) {
      // sqrt (x2-x1)^2 + (y2-y1)^2
      int xDiff = other.x - x;
      int yDiff = other.y - y;
      double ansSq = Math.pow(xDiff, 2) + Math.pow(yDiff, 2);
      return Math.pow(ansSq, 0.5);
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    public void setX(int newX) {
      x = newX;
    }

    public void setY(int newY) {
      y = newY;
    }

    public String pointInfo() {
      String str = "(" + getX() + ", " + getY() + ")";
      return str;
    }
  }
  