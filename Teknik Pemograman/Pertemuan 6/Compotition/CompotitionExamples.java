import java.io.*;
import java.util.*;

class Book {
    public String title;
    public String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

//library class contains list of books

class Library{
    //reference to refer to list of books
    private final List<Book> books;
    Library (List<Book> books){
        this.books = books;
    }
    public List<Book> getTotalBooksInLibrary(){
        return books;
    }
}

class CompositionExamples {
   public static void main(String args[]){
      //creating  the object of book class
      Book b1 = new Book("Give a fuck","Daniel");
      Book b2 = new Book("Baron","Muta");
      Book b3 = new Book("Haru","Nur");
      
      List<Book> books = new ArrayList<Book>();
      books.add(b1);
      books.add(b2);
      books.add(b3);
      
      Library library = new Library(books);
      
      List<Book> bks = library.getTotalBooksInLibrary();
        for(Book bk : bks){
            System.out.println("Title : " + bk.title + " and "+" Author : " + bk.author);
        }
   } 
}