package patterns.Bridge.pattern;

public class BridgeTitleAuthor extends BridgeBook {

    public BridgeTitleAuthor(String author, String title, Implementor implementor) {
        super(author, title, implementor);
    }

    @Override
    public String get() {
        return implementor.showTitle() + " - " + implementor.showAuthor();
    }
    
}
