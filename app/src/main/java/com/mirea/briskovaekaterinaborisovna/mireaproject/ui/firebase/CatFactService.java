package com.mirea.briskovaekaterinaborisovna.mireaproject.ui.firebase;


import retrofit2.Call;
import retrofit2.http.GET;

public interface CatFactService {
    @GET("fact")
    Call<CatFactResponse> getRandomFact();
}
