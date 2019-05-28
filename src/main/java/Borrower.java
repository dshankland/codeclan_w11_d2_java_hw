import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<Book>();
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void borrows(Library library, Book book) {
        this.collection.add(library.lendBook(book));
    }
}
