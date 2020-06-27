package com.example.norrisjokes;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import model.GetAllJokes;
import model.Joke;
import network.JokesRetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private RecyclerView rvJokes;
    private TextView tvError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        rvJokes = findViewById(R.id.rvJokes);
        tvError = findViewById(R.id.tvError);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager
                (this, LinearLayoutManager.HORIZONTAL, false);
        rvJokes.setLayoutManager(linearLayoutManager);
        rvJokes.setLayoutManager(new LinearLayoutManager(this));

        JokesRetrofitClient.getJokesApi().getAllJokes().enqueue(new Callback<GetAllJokes>() {
            @Override
            public void onResponse(Call<GetAllJokes> call, Response<GetAllJokes> response) {

                progressBar.setVisibility(View.GONE);
                tvError.setVisibility(View.GONE);

                List<Joke> value = response.body().getValue();
                JokesAdapter adapter = new JokesAdapter( MainActivity.this,value);
                rvJokes.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<GetAllJokes> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                tvError.setVisibility(View.GONE);

            }
        });


    }
}
