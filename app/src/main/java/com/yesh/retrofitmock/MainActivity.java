package com.yesh.retrofitmock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.yesh.retrofitmock.models.ResponseData;
import com.yesh.retrofitmock.api.RestClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        RestClient.getClient(this).postContent("hello").enqueue(new Callback<ResponseData>() {
//            @Override
//            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
//                Log.d("sample response po yesh", response.body().getData().toString());
//            }
//
//            @Override
//            public void onFailure(Call<ResponseData> call, Throwable t) {
//
//            }
//        });

//        RestClient.getClient(this).content("param1").enqueue(new Callback<ResponseData>() {
//            @Override
//            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
//                Log.d("sample response co yesh", response.body().getData().toString());
//            }
//
//            @Override
//            public void onFailure(Call<ResponseData> call, Throwable t) {
//
//            }
//        });

        RestClient.getClient(this).login("username", "password").enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                Log.d("sample response yesh", response.body().getData().toString());
            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {

            }
        });
    }
}
