package com.kodilla.stream;

import com.kodilla.stream.beautfier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();

        beautifier.beautify("example text", text -> text.toUpperCase());
        beautifier.beautify("another text", text -> text.replace('t', 'T'));
        beautifier.beautify("one more time", text -> "".concat("ABC   ").concat(text).concat("  CBA"));

    }
}
