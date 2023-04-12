package lk.ijse.library.model;

import lk.ijse.library.db.DBConnection;
import lk.ijse.library.dto.Autor;
import lk.ijse.library.dto.Book;
import lk.ijse.library.dto.Member;

import java.sql.*;
import java.util.ArrayList;

public class BookModel {

    public static boolean BookAdd(Book book) throws SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        String sql = "insert into book values(?,?,?,?,?,?)";

        PreparedStatement stm = con.prepareStatement(sql);

        stm.setObject(1,book.getId());
        stm.setObject(2,book.getName());
        stm.setObject(3,book.getAuthor());
        stm.setObject(4,book.getPublisher());
        stm.setObject(5,book.getSupplier());
        stm.setObject(6,book.getQty());


        return stm.executeUpdate() > 0;
    }
//    public static Member searchFrom(String id) throws SQLException {
//        Connection con = DBConnection.getInstance().getConnection();
//        String sql = "select * from member where memberId=?";
//
//        PreparedStatement stm = con.prepareStatement(sql);
//        stm.setObject(1,id);
//
//        ResultSet result = stm.executeQuery();
//
//        if (result.next()) {
//            Member member = new Member();
//            member.setId(result.getString(1));
//            member.setName(result.getString(2));
//            member.setAddress(result.getString(3));
//            member.setContact(result.getString(4));
//            member.setAge(Integer.parseInt(result.getString(5)));
//            member.setEmail(result.getString(6));
//            member.setGender(result.getString(7));
//            return member;
//        }
//        return null;
//    }
//    public static Boolean updateMember(Member member) throws SQLException {
//        Connection con = DBConnection.getInstance().getConnection();
//        String sql = "update member set name=?,address=?,contact=?,age=?,email=?,Gender=? where memberId=?";
//
//        PreparedStatement stm = con.prepareStatement(sql);
//
//        stm.setObject(1, member.getName());
//        stm.setObject(2, member.getAddress());
//        stm.setObject(3, member.getContact());
//        stm.setObject(4, member.getAge());
//        stm.setObject(5,member.getEmail());
//        stm.setObject(6,member.getGender());
//        stm.setObject(7, member.getId());
//
//
//        int result = stm.executeUpdate();
//
//        if (result == 1) {
//            return true;
//        }
//        return null;
//    }
//    public static boolean deleteFrom(String id) throws SQLException {
//        Connection con = DBConnection.getInstance().getConnection();
//        String sql = "delete from member where memberId =?";
//
//        PreparedStatement stm = con.prepareStatement(sql);
//
//        stm.setObject(1, id);
//
//        int result = stm.executeUpdate();
//
//        if (result > 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static ArrayList<Book> loadAllBooks() throws SQLException {

        Connection con = DBConnection.getInstance().getConnection();
        String sql = "select * from book";

        PreparedStatement stm = con.prepareStatement(sql);

        ResultSet result = stm.executeQuery();

        ArrayList<Book> books = new ArrayList<>();

        while (result.next()) {
            Book book = new Book();
            book.setId(result.getString(1));
            book.setName(result.getString(2));
            book.setAuthor(result.getString(3));
            book.setPublisher(result.getString(4));
            book.setSupplier(result.getString(5));
            book.setQty(Integer.parseInt(result.getString(6)));

            books.add(book);
        }

        return books;
    }
    public static ArrayList<String> loadAllBookIds() throws SQLException {

        Connection con = DBConnection.getInstance().getConnection();
        String sql = "select bookId from book";

        PreparedStatement stm = con.prepareStatement(sql);

        ResultSet result = stm.executeQuery();

        ArrayList<String> BookIds = new ArrayList<>();

        while (result.next()) {
            BookIds.add(result.getString(1));
        }
        return BookIds;

    }
    public static Book searchFrom(String id) throws SQLException {

        Connection con = DBConnection.getInstance().getConnection();

        String sql = "select * from book where bookId=?";

        PreparedStatement stm = con.prepareStatement(sql);

        stm.setObject(1,id);

        ResultSet result = stm.executeQuery();

        if (result.next()) {
            Book book = new Book();

            book.setId(result.getString(1));
            book.setName(result.getString(2));
            book.setAuthor(result.getString(3));
            book.setPublisher(result.getString(4));
            book.setSupplier(result.getString(5));
            book.setQty(Integer.parseInt(result.getString(6)));

            return book;
        }
        return null;
    }
 }

