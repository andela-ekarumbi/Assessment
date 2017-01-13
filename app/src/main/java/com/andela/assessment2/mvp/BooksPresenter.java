package com.andela.assessment2.mvp;

import com.andela.assessment2.model.Book;

import java.util.List;

/**
 * Created by Eston on 13/01/2017.
 */

public class BooksPresenter implements Mvp.PresenterActions {

    private Mvp.ModelActions modelActions;

    private Mvp.ViewAction viewAction;

    public BooksPresenter(Mvp.ModelActions modelActions) {
        this.modelActions = modelActions;
    }

    public BooksPresenter(Mvp.ModelActions modelActions, Mvp.ViewAction viewAction) {
        this.modelActions = modelActions;
        this.viewAction = viewAction;
    }

    @Override
    public void getBestSellerList() {
        modelActions.loadBestSellerList();
    }

    @Override
    public void showBestSellerList(List<Book> books) {
        viewAction.displayBookList(books);
    }

    @Override
    public void showErrorMessage(String message) {
        viewAction.displayErrorMessage(message);
    }
}
