package com.example.erinmari_mybookwishlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WishlistArrayAdapter extends ArrayAdapter<Book> {

    public WishlistArrayAdapter(Context context, ArrayList<Book> wishlist) {
        super(context, 0, wishlist);
    }

    //This will display all of the books in the wishlist, with just their title
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;

        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_home, parent, false);
        } else {
            view = convertView;
        }

        //get book from wishlist and set the title and author to TextView to render
        Book book = getItem(position);
        assert book != null;
        TextView bookTitle = view.findViewById(R.id.title_text);
        bookTitle.setText(book.getTitle());
        TextView bookAuthor = view.findViewById(R.id.author_text);
        bookTitle.setText(book.getAuthor());

        return view;
    }
}
