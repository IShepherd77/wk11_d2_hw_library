import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(2);
        book1 = new Book("Mary Berry's best recipes", "Mary Berry", "Cooking");
        book2 = new Book("Jamie's best recipes", "Jamie Oliver", "Cooking");
        book3 = new Book("Nigella's best recipes", "Nigella Lawson", "Cooking");
    }

    @Test
    public void canBorrowABook() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddABookToCollection() {
        borrower.addBook(book1);
        borrower.addBook(book2);
        borrower.addBook(book3);
        assertEquals(3, borrower.bookCount());
    }
}