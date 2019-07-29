package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private Unbinder unbinder;
    List<SongList> mItem = new ArrayList<>();
    RecyclerView mRecycler;
    RecyclerSongAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);


        GetDataService getDataService = RetrofitClientInstance.getApiService(this);
        Call<MusicItems> call = getDataService.getJson();
        call.enqueue(new Callback<MusicItems>() {
            @Override
            public void onResponse(Call<MusicItems> call, Response<MusicItems> response) {
                Toast.makeText(getApplicationContext(), "yesssssssss", Toast.LENGTH_LONG).show();
                mItem.clear();
                if (response.body() != null) {
                    mItem.addAll(response.body().getSongList());
                }
//                mItem = response.body();
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<MusicItems> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "noooooooooo", Toast.LENGTH_LONG).show();

            }
        });

        setRecycler();
    }

    private void setRecycler() {
        mRecycler = mRecyclerView;
        mRecycler.setHasFixedSize(true);
        mAdapter = new RecyclerSongAdapter(mItem, true,true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecycler.setLayoutManager(layoutManager);
        mRecycler.setAdapter(mAdapter);
    }

    @BindView(R.id.mRecycler)
    RecyclerView mRecyclerView;


}
