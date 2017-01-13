package com.andela.assessment2.mvp;

import com.andela.assessment2.model.Book;
import com.andela.assessment2.model.BookListResult;

import java.util.List;

import retrofit2.Callback;

/**
 * Created by Eston on 13/01/2017.
 */

public interface Mvp {

    interface ViewAction {
        void showProgressDialog();

        void hideProgressDialog();

        void displayBookList(List<Book> books);

        void displayErrorMessage(String message);
    }

    interface PresenterActions {
        void getBestSellerList();

        void showBestSellerList(List<Book> books);

        void showErrorMessage(String message);
    }

    interface ModelActions {
        void loadBestSellerList();
    }
}
