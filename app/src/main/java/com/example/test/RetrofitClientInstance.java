package com.example.test;

import android.content.Context;

import com.ncornette.cache.OkCacheControl;

import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static java.util.concurrent.TimeUnit.MINUTES;

public class RetrofitClientInstance {
    private static Retrofit retrofit;
    private static final String BASE_URL = "http://185.105.237.64:8787";
    private static OkHttpClient okhttpClient;
    static OkCacheControl.NetworkMonitor networkMonitor = new OkCacheControl.NetworkMonitor() {
        @Override
        public boolean isOnline() {
            return true;
        }
    };



    private static Retrofit getRetrofitInstance(Context context) {
        if (okhttpClient == null) {
            int cacheSize = 10 * 1024 * 1024; // 10 MB
            Cache cache = new Cache(context.getCacheDir(), cacheSize);
            okhttpClient = OkCacheControl.on(new OkHttpClient.Builder())
                    .overrideServerCachePolicy(1, MINUTES)
                    .forceCacheWhenOffline(networkMonitor)
                    .apply() // return to the OkHttpClient.Builder instance
                    //.addInterceptor(provideHttpLoggingInterceptor())
                    .cache(cache)
                    .build();
            if (retrofit == null) {


                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .client(okhttpClient)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
        }
        return retrofit;


    }




    private static OkHttpClient initOkHttp(Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(7, MINUTES);
        if (BuildConfig.DEBUG) {
            builder.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
        }
        return builder.build();

    }

    public static GetDataService getApiService(Context context) {
        return getRetrofitInstance(context).create(GetDataService.class);
    }


}
