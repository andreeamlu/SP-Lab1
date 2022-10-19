package com.company;
import java.util.ArrayList;
import java.util.List;

public class Author {
    private final String numeleAutorului;

    public Author(String numeleAutorului) {
        this.numeleAutorului = numeleAutorului;
    }

    public void print() {
        System.out.println("Author with name: " + numeleAutorului);
    }
}


