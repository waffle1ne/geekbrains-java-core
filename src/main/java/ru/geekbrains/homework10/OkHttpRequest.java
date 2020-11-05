package ru.geekbrains.homework10;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class OkHttpRequest {
    public static void Request(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        System.out.println("");
        System.out.println("Код ответа: " + response.code());
        if (response.body() != null) {
            System.out.println("Тело ответа:\n" + response.body().string());
        }
    }
}
