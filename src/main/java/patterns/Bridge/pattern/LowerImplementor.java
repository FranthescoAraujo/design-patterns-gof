package patterns.Bridge.pattern;

public class LowerImplementor implements Implementor {

    private String author;
    private String title;

    @Override
    public String showAuthor() {
        return author.toLowerCase();
    }

    @Override
    public String showTitle() {
        return title.toLowerCase();
    }

    @Override
    public void setAuthorAndTitle(String author, String title) {
        this.author = author;
        this.title = title;
    }
    
}
