package com.bookstore.configdb;

import com.bookstore.controller.Constants;
import com.bookstore.entity.Book;
import com.bookstore.exception.ApiException;
import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Config {
    public Connection getArchivalConnection(){
        Connection connection = null;
        String url="jdbc:mysql://localhost:3306/archivalbook";
        try {
            //	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            Class.forName ("com.mysql.cj.jdbc.Driver").newInstance ();
            connection = DriverManager.getConnection (url, "root", "password");

        } catch (InstantiationException e) {
            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new ApiException("sdjhfjs");

        } catch (SQLException e) {
            throw new  ApiException("sdjhfjs");

        }

        return connection;

    }

    public Connection getNormalConnection(){
        Connection connection = null;
        String url="jdbc:mysql://localhost:3306/book";
        try {
            //	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            Class.forName ("com.mysql.cj.jdbc.Driver").newInstance ();
            connection = DriverManager.getConnection (url, "root", "password");

        } catch (InstantiationException e) {
            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new ApiException("sdjhfjs");

        } catch (SQLException e) {
            throw new  ApiException("sdjhfjs");

        }

        return connection;

    }

    public  Map<String,List<Integer>> insertbooks(String query, Connection connection, List<Book> books)
    {
        int[] rows=new int[]{0};
        Map<String,List<Integer>> map=new HashMap<>();
        List<Integer> idsinARchival=new ArrayList<>();
        try {
            PreparedStatement solutionStatement = null;
            solutionStatement = connection.prepareStatement(query);
            for(Book book:books) {
                solutionStatement.setInt(1, book.getId());
                solutionStatement.setString(2, book.getName());
                solutionStatement.setString(3, book.getAuthor());
                solutionStatement.setString(4, book.getPublication());
                solutionStatement.setString(5,book.getCategory());
                solutionStatement.setInt(6,book.getPages());
                solutionStatement.setInt(7,book.getPrice());
                idsinARchival.add(book.getId() );
                solutionStatement.addBatch();

            }

            rows=solutionStatement.executeBatch();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        map.put(Constants.sucess,idsinARchival);
        return  map;
    }

    public   Map<String,List<Integer>> deletebooksfromGeneral(String query, Connection connection, List<Integer> ids )
    {
        int[] rows=new int[]{0};
        Map<String,List<Integer>> map=new HashMap<>();
        List<Integer> idsinNormal=new ArrayList<>();
        try {
            PreparedStatement solutionStatement = null;
            solutionStatement = connection.prepareStatement(query);
            for(int id:ids)
            {

                solutionStatement.setInt(1,id);
                idsinNormal.add(id);
                solutionStatement.addBatch();
            }
            solutionStatement.executeBatch();

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        map.put(Constants.sucess,idsinNormal);
        return map;
    }
    
    public   Map<String,List<Integer>> cdsjbfjkds(String query, Connection connection, List<Integer> ids )
    {
        int[] rows=new int[]{0};
        Map<String,List<Integer>> map=new HashMap<>();
        List<Integer> idsinNormal=new ArrayList<>();
//        try {
//            PreparedStatement solutionStatement = null;
//            {
       dsfjdlkgj
       dsfjds;lg
       dsgkjdsl;gjk
       sdgjl;dsg
//
//                solutionStatement.setInt(1,id);
//                idsinNormal.add(id);

        map.put(Constants.sucess,idsinNormal);
        return map;
    }

}
