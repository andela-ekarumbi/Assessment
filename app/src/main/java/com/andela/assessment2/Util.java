package com.andela.assessment2;

import com.andela.assessment2.model.Book;

/**
 * Created by Eston on 13/01/2017.
 */

public class Util {
    public static Book CURRENT_BOOK;

    public static Book getTestBook() {
        Book book = new Book();
        book.setTitle("Lorem");
        book.setAuthor("Ipsum");
        book.setDescription("Lorem ipsum dolor sit amet");
        return book;
    }
}
