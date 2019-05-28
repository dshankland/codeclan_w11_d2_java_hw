import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("Joy, Inc.", "Richard Sheridan", "Computing");
    }

    @Test
    public void hasTitle() {
        assertEquals("Joy, Inc.", book.getTitle());
    }

    @Test
    public void hasGenre() {
        assertEquals("Computing", book.getGenre());
    }
}
