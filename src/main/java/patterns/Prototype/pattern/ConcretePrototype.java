package patterns.Prototype.pattern;

public class ConcretePrototype implements Cloneable {
    
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Title: " + title + " Author: " + author;
    }

    @Override
    public Object clone() {
        ConcretePrototype clone = new ConcretePrototype();
        clone.setTitle(title);
        clone.setAuthor(author);
        return clone;
    }

}
