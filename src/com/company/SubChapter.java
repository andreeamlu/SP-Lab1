package com.company;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private final String numeleSubCapitolului;
    private final List<Element> listaElemente;

    public SubChapter(String numeleSubCapitolului) {
        this.numeleSubCapitolului = numeleSubCapitolului;
        listaElemente = new ArrayList<>();
    }

    public void print() {
        System.out.println("Subchapter: " + numeleSubCapitolului);
        /*
            for (int i = 0; i < listaElemente.size(); i++) {
                listaElemente.get(i).print();
            }
        */
        /*
            for (Element elementCurent : listaElemente) {
                elementCurent.print();
            }
        */
        listaElemente.forEach(Element::print);
    }

    public void createNewParagraph(String numeleParagrafului) {
        listaElemente.add(new Paragraph(numeleParagrafului));
    }

    public void createNewImage(String numeleImaginii) {
        listaElemente.add(new Image(numeleImaginii));
    }

    public void createNewTable(String numeleTabelei) {
        listaElemente.add(new Table(numeleTabelei));
    }
}
