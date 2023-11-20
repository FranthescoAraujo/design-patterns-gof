package patterns.Bridge.client;

import patterns.Bridge.pattern.BridgeAuthorTitle;
import patterns.Bridge.pattern.BridgeBook;
import patterns.Bridge.pattern.BridgeTitleAuthor;
import patterns.Bridge.pattern.LowerImplementor;
import patterns.Bridge.pattern.UpperImplementor;

public class Main {

    public static void main(String[] args) {
        
        BridgeBook book = new BridgeAuthorTitle("Author 01", "Title 01", new LowerImplementor());
        System.out.println(book.get());

        BridgeBook book2 = new BridgeTitleAuthor("Author 02", "Title 02", new LowerImplementor());
        System.out.println(book2.get());

        BridgeBook book3 = new BridgeAuthorTitle("Author 01", "Title 01", new UpperImplementor());
        System.out.println(book3.get());

        BridgeBook book4 = new BridgeTitleAuthor("Author 02", "Title 02", new UpperImplementor());
        System.out.println(book4.get());

    }
    
}
