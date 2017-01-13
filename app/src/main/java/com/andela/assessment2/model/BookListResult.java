package com.andela.assessment2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eston on 13/01/2017.
 */

public class BookListResult {
    @SerializedName("headers")
    @Expose
    private Headers headers;
    @SerializedName("body")
    @Expose
    private List<Book> books = new ArrayList<>();

    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
