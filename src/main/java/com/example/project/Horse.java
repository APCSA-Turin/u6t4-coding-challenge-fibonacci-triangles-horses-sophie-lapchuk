package com.example.project;

public class Horse  {
    private String name;
    private int weight;

    public Horse(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String horseInfo() {
        return "name: " + name + ", weight: " + weight;
    }
}


 
 


