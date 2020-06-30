package network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JokesRetrofitClient {

    private static final String BASE_URL = "https://api.icndb.com/";
    private static JokesApi jokesApi;

    public static JokesApi getJokesApi() {
        if (jokesApi == null) {
            createJokesApi();
        }
        return jokesApi;
    }

    private static void createJokesApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        jokesApi = retrofit.create(JokesApi.class);

    }
}
