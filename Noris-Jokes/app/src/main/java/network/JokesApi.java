package network;

import model.GetAllJokes;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JokesApi {
    @GET("jokes/random/20")
    Call<GetAllJokes> getAllJokes ();
}
