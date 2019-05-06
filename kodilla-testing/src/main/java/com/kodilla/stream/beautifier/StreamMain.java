package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {


        PoemBeautifier poemBeautifier=new PoemBeautifier();

        poemBeautifier.beautify(("This Is An Example Text"),(text) -> text.toUpperCase());
        poemBeautifier.beautify(("This Is An example Text"),(text) -> ("ABC") +" ".concat(text)+ " "+("ABC"));
        poemBeautifier.beautify(("This Is An example Text"),(text) -> ("!!!!").concat(text).concat("!!!!"));
        poemBeautifier.beautify(("This Is An example Text"),(text) -> text.toLowerCase()+"!!!!!!!!");

    }
}
