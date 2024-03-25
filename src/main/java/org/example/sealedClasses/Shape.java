package org.example.sealedClasses;

public abstract sealed class Shape permits Circle, Rectangle {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

}
