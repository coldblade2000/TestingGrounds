package com.twotowerstudio.testingapp;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Panther II on 11/09/2016.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    private List<Card> cardList;
    private Context mContext;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView cardHeader, cardSubtitle;
        public ImageView imageView;
        public View cardHeaderBarColored;
        public ViewHolder(View view) {
            super(view);
            cardHeader = (TextView) view.findViewById(R.id.cardHeader);
            cardSubtitle = (TextView) view.findViewById(R.id.cardSubtitle);
            imageView = (ImageView) view.findViewById(R.id.imageView);
            cardHeaderBarColored = (View) view.findViewById(R.id.cardHeaderBarColored);

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CardAdapter(Context mContext, List<Card> cardList) {
        this.cardList = cardList;
        this.mContext = mContext;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card1, parent, false);
        // set the view's size, margins, paddings and layout parameters

        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //holder.mTextView.setText(mDataset[position]);
        Card card = cardList.get(position);
        holder.cardHeader.setText(card.getHeader());
        holder.cardSubtitle.setText(card.getSubtitle());
        //holder.imageView.setImageResource(card.getImageId());
        Glide.with(mContext).load(card.getImageId()).into(holder.imageView);
        holder.cardHeaderBarColored.setBackgroundColor(Color.parseColor(card.getBarColor()));


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return cardList.size();
    }
}
