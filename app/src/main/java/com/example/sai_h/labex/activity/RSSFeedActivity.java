package com.example.sai_h.labex.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sai_h.labex.R;
import com.example.sai_h.labex.data.GlobalData;
import com.mittsu.markedview.MarkedView;

public class RSSFeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.sai_h.labex.R.layout.activity_rssfeed);
        MarkedView markedView = findViewById(R.id.md_view);
        markedView.setMDText(GlobalData.rss);
    }
}
