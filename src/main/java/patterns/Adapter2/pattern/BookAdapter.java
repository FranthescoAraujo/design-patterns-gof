package patterns.Adapter2.pattern;

public class BookAdapter extends Book implements BookInterface {

    public BookAdapter(String author, String title) {
        super(author, title);
    }

    @Override
    public String getAuthorAndTitle() {
        return "Author: " + getAuthor() + " Title: " + getTitle();
    }
    
}
