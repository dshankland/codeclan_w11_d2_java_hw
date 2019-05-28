import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int stockCount() {
        return this.books.size();
    }

    public boolean stockFull() {
        return this.stockCount() == this.capacity;
    }

    public void addBook(Book book) {
        if (!this.stockFull()) {
            this.books.add(book);
        }
    }

    public boolean hasBook(Book book) {
        return this.books.contains(book);
    }

    public Book lendBook(Book book) {
        if (this.hasBook(book)) {
            this.books.remove(book);
            return book;
        }
        return null;
    }

    public HashMap returnStockList() {
        HashMap<String, Integer> stockList = new HashMap<String, Integer>();
        for (Book book : this.books){
            String genre = book.getGenre();
            if (stockList.containsKey(genre)) {
                stockList.put(genre, stockList.get(genre) + 1);
            } else {
                stockList.put(genre, 1);
            }
        }
        System.out.println(stockList);
        return stockList;
    }
}
