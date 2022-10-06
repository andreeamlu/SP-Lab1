package com.company;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public String Title;
    public List<String> Paragraphs;
    public List<String> Images;
    public List<String> Tables;
    public Book(String title)
    {
        Title = title;
        Paragraphs = new ArrayList<String>();
        Images = new ArrayList<String>();
        Tables = new ArrayList<String>();

    }
    public void createNewParagraph(String content)
    {
        Paragraphs.add(content);
    }

    public void createNewImage(String content)
    {
        Images.add(content);
    }

    public void createNewTable(String content)
    {
        Tables.add(content);
    }

    public void print()
    {
       String output = Title+ "\n"
                + String.join("\n" , Paragraphs) + "\n"
                + String.join("\n" , Images) + "\n"
                + String.join("\n" , Tables);
        System.out.println(output);
    }


}
