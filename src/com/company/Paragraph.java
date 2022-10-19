package com.company;

public class Paragraph implements Element {
    private final String numeleParagrafului;

    public Paragraph(String numeleParagrafului) {
        this.numeleParagrafului = numeleParagrafului;
    }

    public void print() {
        System.out.println("Paragraph: " + numeleParagrafului);
    }
}
