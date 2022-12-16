package service.impl;

import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookSeviceImpl  implements BookService {

     private List<Book>bookList=new ArrayList<>();
    @Override
    public List<Book> createBooks(List<Book> books) {
        return this.bookList;
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookList;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        return null;
    }

    @Override
    public Book removeBookById(Long id) {
        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        return null;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        return null;
    }

    @Override
    public Book maxPriceBook() {
        return null;
    }
}
