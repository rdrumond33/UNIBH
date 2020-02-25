package com.example.aulaprtica6;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class RestConnection {
    // Método POST HTTP
    public static String post(String url, String params){

        OkHttpClient client = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        builder.url(url);
        //MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(mediaType, params);
        builder.post(body);
        Request request = builder.build();
        try{
            Response response = client.newCall(request).execute();
            return response.body().string();
        }catch (IOException erro){
            return null;
        }
    }

    // Método GET HTTP
    public static String get(String url, String params){

        OkHttpClient client = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        builder.url(url);
        //MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(mediaType, params);
        builder.get();
        Request request = builder.build();
        try{
            Response response = client.newCall(request).execute();
            return response.body().string();
        }catch (IOException erro){
            return null;
        }
    }
}