package com.andela.assessment2.mvp;

import com.andela.assessment2.api.ApiClient;
import com.andela.assessment2.model.Book;
import com.andela.assessment2.model.BookListResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Eston on 13/01/2017.
 */

public class BooksModel implements Mvp.ModelActions {

    private Mvp.PresenterActions presenterActions;

    public BooksModel(Mvp.PresenterActions presenterActions) {
        this.presenterActions = presenterActions;
    }

    @Override
    public void loadBestSellerList() {
        new ApiClient().getBestSellerHistoryList(new Callback<BookListResult>() {
            @Override
            public void onResponse(Call<BookListResult> call, Response<BookListResult> response) {
                List<Book> books = response.body().getBooks();
                presenterActions.showBestSellerList(books);
            }

            @Override
            public void onFailure(Call<BookListResult> call, Throwable t) {
                presenterActions.showErrorMessage(t.getMessage());
            }
        });
    }
}
