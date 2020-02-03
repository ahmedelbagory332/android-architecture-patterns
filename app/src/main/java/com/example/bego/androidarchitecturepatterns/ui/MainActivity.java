package com.example.bego.androidarchitecturepatterns.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.bego.androidarchitecturepatterns.pojo.MovieModle;
import com.example.bego.androidarchitecturepatterns.R;

public class MainActivity extends AppCompatActivity implements MovieView {

    private static final String TAG = "MainActivity";
    MoviePresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         presenter = new MoviePresenter(this);

    }


    // MVC
    public MovieModle getMovieFromDatabase(){
        return new MovieModle("cast away" , "28-8-1998" , "good movie" , 1);
    }

    public void getmovie(View view) {

        presenter.getMovieName();

        Log.d(TAG, "test mvc getmovie: "+getMovieFromDatabase().getName());

    }

    @Override
    public void onGetMovieName(String name) {

        Log.d(TAG, "test mvp getmovie: "+name);


    }
}
