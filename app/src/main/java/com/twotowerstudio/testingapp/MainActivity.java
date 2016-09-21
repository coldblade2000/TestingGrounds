package com.twotowerstudio.testingapp;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<Card> cardList;
    /** http://www.androidhive.info/2016/05/android-working-with-card-view-and-recycler-view/ */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.rvMain);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        //mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        //Populate Cards
        cardList = new ArrayList<>();
        prepareListData();
        // specify an adapter (see also next example)

        mAdapter = new CardAdapter(this, cardList);
        mRecyclerView.setAdapter(mAdapter);



    }
    private  void prepareListData(){
        int[] images = new int[]{
                R.drawable.soccer,
                R.drawable.book,
                R.drawable.envelope
        };

        Card a = new Card("Today you have PE!", "Your professor is Dario Balta", images[0], "#29b6f6"); cardList.add(a);
        a = new Card("You've Got Mail", "Sender: Camilo Salazar", images[2], "#ffee58"); cardList.add(a);
        a = new Card("You have homework", "Subject: English", images[1], "#66bb6a"); cardList.add(a);
        a = new Card("Today you have PE!", "Your professor is Danilo", images[0], "#29b6f6"); cardList.add(a);
        a = new Card("You've Got Mail", "Sender: Urdaneta ", images[2], "#ffee58"); cardList.add(a);
        a = new Card("You have homework", "Subject: Spanish", images[1], "#66bb6a"); cardList.add(a);

    }
}
