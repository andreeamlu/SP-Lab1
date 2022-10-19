package com.company;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private final String titlulCartii;
    @SuppressWarnings("FieldCanBeLocal")
    private Author obiectAutor;
    private List<Chapter> listaCapitole;

    public Book(String titlulCartii) {
        this.titlulCartii = titlulCartii;
        this.listaCapitole = new ArrayList<>();
    }

    public void print() {
        System.out.println("Book with title: " + titlulCartii);
    }

    public void addAuthor(Author obiectAutor) {
        this.obiectAutor = obiectAutor;
    }

    public int createChapter(String numeleCapitolului) {
        listaCapitole.add(new Chapter(numeleCapitolului));
        return listaCapitole.size() - 1;
    }

    public Chapter getChapter(int indexChapterOne) {
        return listaCapitole.get(indexChapterOne);
    }
}
