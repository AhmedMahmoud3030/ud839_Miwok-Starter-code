package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, ArrayList<Word> WordList,int ColorResourceId) {
        super(context,0, WordList);
        mColorResourceId=ColorResourceId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        View TextContaner=listItemView.findViewById(R.id.textContaner);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        TextContaner.setBackgroundColor(color);


        TextView firstWordTextView = (TextView) listItemView.findViewById(R.id.firstWord);
        firstWordTextView.setText(currentWord.getDefaultTranslation());

        TextView secondWordTextView = (TextView) listItemView.findViewById(R.id.secondWord);
        secondWordTextView.setText(currentWord.getMiwokTranslation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);


        }else {
            imageView.setVisibility(View.GONE);
        }





        return listItemView;
    }
}
