package com.kodilla3.testing3.shape;

import java.util.Objects;

public class Square implements Shape {
    private String name;
    private Integer field;

    public Square(String name, Integer field) {
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
        Square square = (Square) o;
        return Objects.equals(name, square.name) &&
                Objects.equals(field, square.field);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, field);
    }
}
