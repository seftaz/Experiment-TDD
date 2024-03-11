package test.classes;

import main.classes.Book;
import main.classes.Library;
import main.classes.SearchByType;
import main.classes.Student;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @org.junit.jupiter.api.Test
    void lendBook() {

        Library library = new Library();

        Book book1 = new Book("Book-1", "Author-1", 10);
        Book book2 = new Book("Book-2", "Author-2", 11);
        Book book3 = new Book("Book-3", "Author-3", 12);

        Student student1 = new Student("Alice", 10);
        Student student2 = new Student("Bob", 11);
        Student student3 = new Student("John", 12);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addStudent(student1);
        library.addStudent(student2);

        assertAll(() -> assertTrue(library.lendBook(book1, student1)),
                () -> assertTrue(library.lendBook(book2, student2)),
                () -> assertFalse(library.lendBook(book2, student1)),
                () -> assertFalse(library.lendBook(book3, student3)));

    }

    @org.junit.jupiter.api.Test
    void returnBook() {
        Library library = new Library();

        Book book1 = new Book("Book-1", "Author-1", 10);
        Book book2 = new Book("Book-2", "Author-2", 11);
        Book book3 = new Book("Book-3", "Author-3", 12);

        Student student1 = new Student("Alice", 10);
        Student student2 = new Student("Bob", 11);
        Student student3 = new Student("John", 12);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addStudent(student1);
        library.addStudent(student2);
        library.addStudent(student3);

        library.lendBook(book1, student1);
        library.lendBook(book2, student3);

        assertAll(() -> assertTrue(library.returnBook(book1, student1)),
                () -> assertTrue(library.returnBook(book2, student3)),
                () -> assertFalse(library.returnBook(book1, student1)));


    }

    @org.junit.jupiter.api.Test
    void notName() {
        Library library = new Library();

        Book book1 = new Book("Book-1", "Author-1", 10);
        Book book2 = new Book("Book-2", "Author-2", 11);


        library.addBook(book1);
        library.addBook(book2);

        var keys = new ArrayList<Object>(Arrays.asList("Book-1", "Book-2"));

        assertNull(library.searchBooks(SearchByType.NAME, keys));
    }
}