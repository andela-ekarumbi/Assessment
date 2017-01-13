package com.andela.assessment2.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.andela.assessment2.R;
import com.andela.assessment2.model.Book;

import java.util.List;

/**
 * Created by Eston on 13/01/2017.
 */

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.VH> {

    private Context context;

    private List<Book> books;

    private BookItemClickListener listener;

    public BooksAdapter(Context context, List<Book> books, BookItemClickListener listener) {
        this.context = context;
        this.books = books;
        this.listener = listener;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context)
                .inflate(R.layout.layout_book_item, parent, false);
        return new VH(v);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class VH extends RecyclerView.ViewHolder {

        TextView bookTitle;

        TextView bookAuthor;

        public VH(View itemView) {
            super(itemView);
            bookTitle = (TextView) itemView.findViewById(R.id.book_title);
            bookAuthor = (TextView) itemView.findViewById(R.id.book_author);
        }

        //void bind
    }
}
