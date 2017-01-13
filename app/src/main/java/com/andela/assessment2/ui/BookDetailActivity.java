package com.andela.assessment2.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.andela.assessment2.R;
import com.andela.assessment2.Util;
import com.andela.assessment2.model.Book;

import static com.andela.assessment2.Util.CURRENT_BOOK;

/**
 * Created by Eston on 12/01/2017.
 */

public class BookDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
        loadViews();
    }

    private void loadViews() {
        if (CURRENT_BOOK == null) {
            CURRENT_BOOK = Util.getTestBook();
        }
        TextView titleView = (TextView) findViewById(R.id.book_title);
        titleView.setText(CURRENT_BOOK.getTitle());
        TextView authorView = (TextView) findViewById(R.id.book_author);
        authorView.setText(CURRENT_BOOK.getAuthor());
        TextView publisherView = (TextView) findViewById(R.id.book_publisher);
        publisherView.setText(CURRENT_BOOK.getPublisher());
        TextView descriptionView = (TextView) findViewById(R.id.book_description);
        descriptionView.setText(CURRENT_BOOK.getDescription());
    }
}
