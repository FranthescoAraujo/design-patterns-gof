package patterns.Bridge.pattern;

public class BridgeAuthorTitle extends BridgeBook {

    public BridgeAuthorTitle(String author, String title, Implementor implementor) {
        super(author, title, implementor);
    }

    @Override
    public String get() {
        return implementor.showAuthor() + " - " + implementor.showTitle();
    }
    
}
