package patterns.Bridge.pattern;

public abstract class BridgeBook {
    
    protected Implementor implementor;

    public BridgeBook(String author, String title, Implementor implementor) {
        implementor.setAuthorAndTitle(author, title);
        this.implementor = implementor;
    }

    public abstract String get();

}
