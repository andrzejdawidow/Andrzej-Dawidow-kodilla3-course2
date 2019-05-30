package com.kodilla3.testing3.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private String name;
    private Integer field;

    public Triangle(String name, Integer field) {
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
        Triangle triangle = (Triangle) o;
        return Objects.equals(name, triangle.name) &&
                Objects.equals(field, triangle.field);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, field);
    }
}
