package org.example;

import java.util.ArrayList;

public class Author {

    private int id = 1;
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
    public static void setAuthorEdit(int id,String name,String surname)
    {
        for(int i = 1; i < authorArr.size(); i++)
        {
            if(authorArr.get(i).id == id)
            {
                authorArr.get(i).setAuthorName(name);
                authorArr.get(i).setAuthorSurname(surname);
            }
        }
    }
    public static void removeById(int id)
    {
        authorArr.remove(Author.getAuthorArrById(id));
    }
    public static Author getAuthorArrById(int id) {
        int position = 0;
        for(int i = 1; i <= authorArr.size(); i++)
        {
            if(authorArr.get(i).getId() == id)
            {
                position = i;
                break;
            }
        }
        return authorArr.get(position);
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
