package patterns.Bridge.pattern;

public class UpperImplementor implements Implementor {

    private String author;
    private String title;

    @Override
    public String showAuthor() {
        return author.toUpperCase();
    }

    @Override
    public String showTitle() {
        return title.toUpperCase();
    }

    @Override
    public void setAuthorAndTitle(String author, String title) {
        this.author = author;
        this.title = title;
    }
    
}
