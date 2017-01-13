package com.andela.assessment2.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.andela.assessment2.R;
import com.andela.assessment2.Util;
import com.andela.assessment2.model.Book;
import com.andela.assessment2.mvp.BooksModel;
import com.andela.assessment2.mvp.BooksPresenter;
import com.andela.assessment2.mvp.Mvp;

import java.util.List;

public class BookListActivity extends AppCompatActivity implements Mvp.ViewAction {

    private ProgressDialog progressDialog;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        progressDialog = new ProgressDialog(this);
        progressDialog.setIndeterminate(true);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        initPresenter();
    }

    private void initPresenter() {
        Mvp.PresenterActions presenterActions = new BooksPresenter(this);
        presenterActions.setModelActions(new BooksModel(presenterActions));
        presenterActions.getBestSellerList();
    }

    @Override
    public void showProgressDialog() {
        progressDialog.show();
    }

    @Override
    public void hideProgressDialog() {
        progressDialog.dismiss();
    }

    @Override
    public void displayBookList(List<Book> books) {
        BooksAdapter adapter = new BooksAdapter(this, books, getBookListener());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private BookItemClickListener getBookListener() {
        return new BookItemClickListener() {
            @Override
            public void onItemClicked(Book book) {
                Util.CURRENT_BOOK = book;
                Intent intent = new Intent(BookListActivity.this, BookDetailActivity.class);
                startActivity(intent);
            }
        };
    }

    @Override
    public void displayErrorMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
