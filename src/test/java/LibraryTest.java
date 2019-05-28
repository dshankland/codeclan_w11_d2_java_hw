import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void setUp() {
        book1 = new Book("Joy, Inc.", "Richard Sheridan", "Computing");
        book2 = new Book("The Dead Zone", "Steven King", "Horror");
        book3 = new Book("The Soul of a Butterfly", "Hana Yasmeen Ali", "Biography");
        library = new Library(9);
//        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void hasStock() {
        assertEquals(2, library.stockCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(3, library.stockCount());
    }

    @Test
    public void cannotAddBook() {
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(9, library.stockCount());
    }

    @Test
    public void containsBook() {
        assertEquals(true, library.hasBook(book2));
    }

    @Test
    public void canLendBook() {
        library.addBook(book1);
        assertEquals(book1, library.lendBook(book1));
    }

    @Test
    public void checkStockList() {
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book3);
        library.addBook(book3);
        library.addBook(book3);
        HashMap stockList = library.returnStockList();
        assertEquals(2, stockList.get("Horror"));
        assertEquals(3, stockList.get("Computing"));
        assertEquals(4, stockList.get("Biography"));
    }
}
