package com.wordpress.rahulhp.jokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class JokeActivity extends ActionBarActivity{
    String Joke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        Joke = bundle.getString("JOKE_INTENT");
        setContentView(R.layout.activity_joke);
    }
}
