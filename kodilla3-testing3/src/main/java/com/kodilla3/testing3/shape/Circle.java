package com.kodilla3.testing3.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String name;
    private Integer field;

    public Circle(String name, Integer field) {
        this.name = name;
        this.field = field;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getShapeName() {
        return null;
    }

    public Integer getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(name, circle.name) &&
                Objects.equals(field, circle.field);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, field);
    }
}
