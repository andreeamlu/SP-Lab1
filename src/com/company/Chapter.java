package com.company;
import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private final String numeleCapitolului;
    private final List<SubChapter> listaSubcapitole;

    public Chapter(String numeleCapitolului) {
        this.numeleCapitolului = numeleCapitolului;
        listaSubcapitole = new ArrayList<>();
    }

    public void print() {
        System.out.println("Paragraph: " + numeleCapitolului);
    }

    public int createSubChapter(String numeleSubcapitolului) {
        listaSubcapitole.add(new SubChapter(numeleSubcapitolului));
        return listaSubcapitole.size() - 1;
    }

    public SubChapter getSubChapter(int indexulSubcapitolului) {
        return listaSubcapitole.get(indexulSubcapitolului);
    }
}
