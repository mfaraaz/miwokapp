package com.example.miwoklang;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    private int mColorResourcceId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param androidFlavors A List of AndroidFlavor objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> androidFlavors,int ColorResourcceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidFlavors);
        mColorResourcceId=ColorResourcceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }
        Word curWord= (Word) getItem(position);
        TextView MiwokWord =(TextView)listItemView.findViewById(R.id.miwokTV);
        MiwokWord.setText(curWord.getMiwokTrannslation());

        TextView defaultWord=(TextView)listItemView.findViewById(R.id.defaultTV);
        defaultWord.setText(curWord.getDefaultTranslation());
        ImageView iconView = (ImageView)listItemView.findViewById(R.id.list_icon);



        if(curWord.hasImage()) {
            iconView.setImageResource(curWord.getImageResId());
        }
        else {
            iconView.setVisibility(View.GONE);
        }

        View textColor=(View)listItemView.findViewById(R.id.textColor);
        int colorText= ContextCompat.getColor(getContext(),mColorResourcceId);
        textColor.setBackgroundColor(colorText);


        return listItemView;
    }
}
