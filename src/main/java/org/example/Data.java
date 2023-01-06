package org.example;

public class Data {
    private String name = "Vardenis";
    private String surname = "Pavardenis";
    Data(int x)
    {
        for(int i=0;i<x;i++)
        {
           Author.authorArr.add( new Author(name+i,surname+i) );
        }
    }
}
