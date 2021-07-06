package com.example.navigationapplication.data

import com.example.navigationapplication.R
import com.example.navigationapplication.model.Movie

class Datasource {

    fun loadMovies(): List<Movie> {
        return listOf<Movie>(
            Movie(R.string.movie1, R.drawable.movie),
            Movie(R.string.movie2, R.drawable.movie),
            Movie(R.string.movie3, R.drawable.movie),
            Movie(R.string.movie4, R.drawable.movie),
            Movie(R.string.movie5, R.drawable.movie),
            Movie(R.string.movie6, R.drawable.movie),
            Movie(R.string.movie7, R.drawable.movie)
        )
    }
}

