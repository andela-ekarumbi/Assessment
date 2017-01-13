package com.andela.assessment2.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.andela.assessment2.R;
import com.andela.assessment2.model.Book;
import com.andela.assessment2.mvp.Mvp;

import java.util.List;

public class BookListActivity extends AppCompatActivity implements Mvp.ViewAction {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void hideProgressDialog() {

    }

    @Override
    public void displayBookList(List<Book> books) {

    }

    @Override
    public void displayErrorMessage(String message) {

    }
}
