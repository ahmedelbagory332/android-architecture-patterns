package com.example.bego.androidarchitecturepatterns.ui;


import com.example.bego.androidarchitecturepatterns.pojo.MovieModle;

// MVP
public class MoviePresenter {

    MovieView movieView ;

    public MoviePresenter(MovieView movieView) {
        this.movieView = movieView;
    }

    public MovieModle getMovieFromDatabase(){
        return new MovieModle("cast away" , "28-8-1998" , "good movie" , 1);
    }

    public void getMovieName(){
        movieView.onGetMovieName(getMovieFromDatabase().getName());
    }
}
