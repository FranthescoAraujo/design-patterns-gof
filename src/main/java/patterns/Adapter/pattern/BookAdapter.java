package patterns.Adapter.pattern;

public class BookAdapter implements BookInterface {

    private Book book;

    public BookAdapter(Book book) {
        this.book = book;
    }

    @Override
    public String getAuthorAndTitle() {
        return "Author: " + book.getAuthor() + " Title: " + book.getTitle();
    }
    
}
