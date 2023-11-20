package patterns.Adapter.client;

import patterns.Adapter.pattern.Book;
import patterns.Adapter.pattern.BookAdapter;
import patterns.Adapter.pattern.RenderBook;

public class Main {
    
    public static void main(String[] args) {
        
        Book book = new Book("Title 01", "Author 01");
        BookAdapter bookAdapter = new BookAdapter(book);
        RenderBook renderBook = new RenderBook(bookAdapter);
        System.out.println(renderBook.renderTitleAndName());

    }

}
