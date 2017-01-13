package com.andela.assessment2.api;

import com.andela.assessment2.model.BookListResult;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Eston on 13/01/2017.
 */

public interface BookService {
    @GET("lists/best-sellers/history.json?api_key=852b2c14bb064a079aa98ebb5ef57660")
    Call<BookListResult> getBestSellersHistoryList();
}
