package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.assignment1.Model.IMoviesDA;
import com.example.assignment1.Model.Movie;
import com.example.assignment1.Model.MoviesFactory;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText edtResult;
    EditText edtSearch;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtResult =findViewById(R.id.edtResult);
        edtSearch =findViewById(R.id.edtSearch);
        spinner = findViewById(R.id.spinner);
        populateSpinner();
    }

    private void populateSpinner() {
        MoviesFactory factory = new MoviesFactory();
        IMoviesDA objMovie =factory.getModel();
        String[] result =objMovie.getTypesOfSearch();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,result);
        spinner.setAdapter(adapter);

    }

    public void btnSearch(View view) {
        String type =spinner.getSelectedItem().toString();
        MoviesFactory factory = new MoviesFactory();
        IMoviesDA objMovie =factory.getModel();
        List<Movie> resultList = objMovie.getMovies(type,edtSearch.getText().toString());
        String result="";
        int count=1;
        for (Movie movie : resultList){
            result+="#"+(count++) +" "+movie.toString()+"\n";
        }
        edtResult.setText(result);
    }
}