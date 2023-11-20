package patterns.Adapter2.client;

import patterns.Adapter2.pattern.BookAdapter;
import patterns.Adapter2.pattern.RenderBook;

public class Main {
    
    public static void main(String[] args) {
        
        BookAdapter bookAdapter = new BookAdapter("Title 02", "Author 02");
        RenderBook renderBook = new RenderBook(bookAdapter);
        System.out.println(renderBook.renderTitleAndName());

    }

}
