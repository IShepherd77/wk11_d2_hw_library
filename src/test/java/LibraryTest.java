import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void before() {
        library = new Library(3);
        book1 = new Book("Mary Berry's best recipes", "Mary Berry", "Cooking");
        book2 = new Book("Jamie's best recipes", "Jamie Oliver", "Cooking");
        book3 = new Book("Nigella's best recipes", "Nigella Lawson", "Cooking");
    }

    @Test
    public void libraryIsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBookMoreThanCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.bookCount());
    }
}
