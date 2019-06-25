package com.kodilla3.stream3.beautifier;

public class PoemBeautifier {
    public String beautify(String tekst, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(tekst);
    }
}
