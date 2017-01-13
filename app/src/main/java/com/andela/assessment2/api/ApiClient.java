package com.andela.assessment2.api;

import com.andela.assessment2.model.BookListResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Eston on 13/01/2017.
 */

public class ApiClient {

    public static String API_BASE;

    private Retrofit retrofit;

    public ApiClient() {
        if (API_BASE == null) {
            API_BASE = "http://api.nytimes.com/svc/books/";
        }
        retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public void getBestSellerHistoryList(Callback<BookListResult> callback) {
        BookService bookService = retrofit.create(BookService.class);
        Call<BookListResult > bookCall = bookService.getBestSellersHistoryList();
        bookCall.enqueue(callback);
    }
}
