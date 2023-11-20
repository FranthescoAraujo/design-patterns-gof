package patterns.Adapter2.pattern;

public class RenderBook {
    
    private BookInterface book;

    public RenderBook(BookInterface book) {
        this.book = book;
    }

    public String renderTitleAndName() {
        return book.getAuthorAndTitle();
    }

}
