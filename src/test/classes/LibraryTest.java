package test.classes;

import main.classes.Book;
import main.classes.Library;
import main.classes.SearchByType;
import main.classes.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    void nullReturnWhenWrongTypeInSearchStudents() {
        Library library = new Library();

        SearchByType author = SearchByType.AUTHOR;
        SearchByType title = SearchByType.TITLE;

        Student student = new Student("Gholam", 25);

        assertNull(library.searchStudents(author, new ArrayList<>(List.of("Gholam"))));
        assertNull(library.searchStudents(title, new ArrayList<>(List.of(25))));
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

    @org.junit.jupiter.api.Test
    void searchStudentByID() {
        Library library = new Library();

        Student student1 = new Student("Gholam", 25);
        Student student2 = new Student("GholamReza", 26);
        Student student3 = new Student("GholamKambiz", 27);

        library.addStudent(student1);
        library.addStudent(student2);
        library.addStudent(student3);

        ArrayList<Student> wanted = new ArrayList<>();
        wanted.add(student1);
        wanted.add(student2);

        ArrayList<Student> students = library.searchStudents(SearchByType.ID, new ArrayList<>(Arrays.asList(25, 26)));
        assertArrayEquals(students.toArray(), wanted.toArray());
    }

    @org.junit.jupiter.api.Test
    void searchStudentByName() {
        Library library = new Library();

        Student student1 = new Student("Gholam", 25);
        Student student2 = new Student("GholamReza", 26);
        Student student3 = new Student("GholamKambiz", 27);

        library.addStudent(student1);
        library.addStudent(student2);
        library.addStudent(student3);

        ArrayList<Student> wanted = new ArrayList<>();
        wanted.add(student1);
        wanted.add(student2);

        ArrayList<Student> students = library.searchStudents(SearchByType.NAME, new ArrayList<>(Arrays.asList("Gholam", "GholamReza")));
        assertArrayEquals(students.toArray(), wanted.toArray());
    }

    @org.junit.jupiter.api.Test
    void searchBooksByID() {
        Library library = new Library();

        Book book1 = new Book("Book-1", "Author-1", 10);
        Book book2 = new Book("Book-2", "Author-2", 11);
        Book book3 = new Book("Book-3", "Author-3", 12);


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        var keys = new ArrayList<Object>(Arrays.asList(10, 12));

        assertEquals(new ArrayList<Book>(Arrays.asList(book1, book3)), library.searchBooks(SearchByType.ID, keys));
    }

    @org.junit.jupiter.api.Test
    void searchBooksByTitle() {
        Library library = new Library();

        Book book1 = new Book("Book-1", "Author-1", 10);
        Book book2 = new Book("Book-2", "Author-2", 11);
        Book book3 = new Book("Book-3", "Author-3", 12);


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        var keys = new ArrayList<Object>(Arrays.asList("Book-1", "Book-2"));

        assertEquals(new ArrayList<Book>(Arrays.asList(book1, book2)), library.searchBooks(SearchByType.TITLE, keys));
    }

    @org.junit.jupiter.api.Test
    void searchBooksByAuthor() {
        Library library = new Library();

        Book book1 = new Book("Book-1", "Author-1", 10);
        Book book2 = new Book("Book-2", "Author-2", 11);
        Book book3 = new Book("Book-3", "Author-3", 12);


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        var keys = new ArrayList<Object>(Arrays.asList("Author-2", "Author-3"));

        assertEquals(new ArrayList<Book>(Arrays.asList(book2, book3)), library.searchBooks(SearchByType.AUTHOR, keys));
    }

}