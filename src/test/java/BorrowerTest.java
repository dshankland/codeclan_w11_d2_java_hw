import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void setUp() {
        borrower = new Borrower();
        library = new Library(5);
        book1 = new Book("Joy, Inc.", "Richard Sheridan", "Computing");
        book2 = new Book("The Dead Zone", "Steven King", "Horror");
        book3 = new Book("The Soul of a Butterfly", "Hana Yasmeen Ali", "Biography");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void hasBooks() {
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void hasBorrowedBook() {
        borrower.borrows(library, book3);
        assertEquals(1, borrower.collectionCount());
        assertEquals(2,library.stockCount());
    }
}
