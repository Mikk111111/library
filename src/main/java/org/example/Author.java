package org.example;

import java.util.ArrayList;

public class Author {

    private int id;
    private static int current;
    private String authorName;
    private String authorSurname;
    public static ArrayList<Author> authorArr= new ArrayList<Author>();

    Author()
    {
        this.id = ++current;
    }
    Author(String authorName,String authorSurname)
    {
        current++;
        this.id = ++current;
        this.authorName=authorName;
        this.authorSurname=authorSurname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public Author getAuthorArrById(int i) {
        return authorArr.get(i);
    }
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", Name='" + authorName + '\'' +
                ", Surname='" + authorSurname + '\'' +
                '}';
    }
}
