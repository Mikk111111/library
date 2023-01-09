package org.example;

import java.util.Scanner;

public class Main {
//    public static Author ath = new Author();

    public static void main(String[] args) {
        Data dd = new Data(10);
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean isWorking = true;
        while (isWorking)
        {
            System.out.println("1: print all content");
            System.out.println("2: print by ID");
            System.out.println("3: add content");
            System.out.println("4: update content");
            System.out.println("5: delete content");
            System.out.println("6: end work");
            try
            {
                number = sc.nextInt();
                sc.nextLine();
            }catch (Exception e)
            {
                System.out.println("Unrecognized number,");
                System.out.println("try again");
            }
            switch (number)
            {
                case 1:
                    for (int i=0;i<Author.authorArr.size();i++)
                    {
                        System.out.println(Author.authorArr.get(i));
                    }
                    break;
                case 2:
                    try
                    {
                        number = sc.nextInt();
                        number--;
                        if(number<=0)
                        {
                            System.out.println("Must be over 0,");
                            System.out.println("try again");
                        }
                        else
                        {
                           System.out.println(Author.getAuthorArrById(number));
                        }
                    }catch (Exception e)
                    {
                        System.out.println("Unrecognized number,");
                        System.out.println("try again");
                    }
                    break;
                case 3:
                    System.out.println("New name");
                    String nname = sc.nextLine();
                    System.out.println("New surname");
                    String ssurname = sc.nextLine();
                    Author.authorArr.add( new Author(nname,ssurname) );
                    break;
                case 4:
                    try
                    {
                        number = sc.nextInt();
                        if(number<=0)
                        {
                            System.out.println("Must be over 0,");
                            System.out.println("try again");
                        }
                        else
                        {
                            System.out.println("New name");
                            sc.nextLine();
                            nname = sc.nextLine();
                            System.out.println("New surname");
                            ssurname = sc.nextLine();
                            Author.setAuthorEdit(number,nname,ssurname);
                        }
                    }catch (Exception e)
                    {
                        System.out.println("Unrecognized number,");
                        System.out.println("try again");
                    }
                    break;
                case 5:
                    try
                    {
                        number = sc.nextInt();
                        if(number<=0)
                        {
                            System.out.println("Must be over 0,");
                            System.out.println("try again");
                        }
                        else
                        {
                            Author.removeById(number);
                        }
                    }catch (Exception e)
                    {
                        System.out.println("Unrecognized number,");
                        System.out.println("try again");
                    }
                    break;
                case 6:
                    System.out.println("Ending work");
                    isWorking=false;
                    break;
                default:
                    break;
            }
        }
    }
}
