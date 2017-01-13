package com.andela.assessment2.mvp;

import com.andela.assessment2.model.Book;

import java.util.List;

/**
 * Created by Eston on 13/01/2017.
 */

public class BooksPresenter implements Mvp.PresenterActions {

    private Mvp.ModelActions modelActions;

    private Mvp.ViewAction viewAction;

    public void setModelActions(Mvp.ModelActions modelActions) {
        this.modelActions = modelActions;
    }

    public BooksPresenter(Mvp.ViewAction viewAction) {

        this.viewAction = viewAction;
    }

    @Override
    public void getBestSellerList() {
        viewAction.showProgressDialog();
        modelActions.loadBestSellerList();
    }

    @Override
    public void showBestSellerList(List<Book> books) {
        viewAction.hideProgressDialog();
        viewAction.displayBookList(books);
    }

    @Override
    public void showErrorMessage(String message) {
        viewAction.hideProgressDialog();
        viewAction.displayErrorMessage(message);
    }
}
