package patterns.Bridge.pattern;

public interface Implementor {
    
    public void setAuthorAndTitle(String author, String title);
    public String showAuthor();
    public String showTitle();

}
