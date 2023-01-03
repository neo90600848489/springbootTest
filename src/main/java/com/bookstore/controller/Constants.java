package com.bookstore.controller;

public class Constants {

    public static String[] name = new String[]{"C++","Java Intensive","A Better India: A Better World","A Passage to India","A Revenue Stamp"};
    public static String[] author = new String[]{"bipul","rishabh","rahul","suman","deepti"};
    public static String[] publication = new String[]{"mCgrah","divyabharti","bookspublication","kerla publication","southafrica publication"};
    public static String[] category = new String[]{"drama","sci-fi ","horror","category1","category2"};
    public static Integer[] pages  = new Integer[]{34,345,323,23,26};
    public static Integer[] prices = new Integer[]{234,34,38,32,24};
    public static String  insertbook="insert into book(id,name,author,publication,category,pages,price) values (?,?,?,?,?,?,?)";
    public static String selectbookFromAuthor="SELECT b FROM Book b where b.author=:name";
    public static  String sucess="SUCCESS";
    public static  String deletequery="delete from book b where b.id=?";

}
