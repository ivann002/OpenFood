package com.example.openfood;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public interface MyApiEndpointInterface {
        @GET("/posts")
        Call<List<Post>> getPosts();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://world.openfoodfacts.org/api/v0/product/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyApiEndpointInterface apiService = retrofit.create(MyApiEndpointInterface.class);

        Call<List<Post>> call = apiService.getPosts();

        apiService.

        {
            public void onResponse (Call<List<Post>> call, Response <List<Post>> response){
            List<Post> posts = response.body();
            // procesa la respuesta aquí
        }

        });
    }


}