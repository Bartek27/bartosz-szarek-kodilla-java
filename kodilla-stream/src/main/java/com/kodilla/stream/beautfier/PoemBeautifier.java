package com.kodilla.stream.beautfier;

public class PoemBeautifier {

    public String beautify(String toBeDecorated, PoemDecorator poemDecorator) {

        String decoratedString = poemDecorator.decorate(toBeDecorated);
        System.out.println("The String after decoration: " + decoratedString);

        return decoratedString;
    }
}
