import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {


    private Book book;

    @Before
    public void before(){
        book = new Book("Mary Berry's best recipes", "Mary Berry", "Cooking");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Mary Berry's best recipes", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Mary Berry", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Cooking", book.getGenre());
    }
}
