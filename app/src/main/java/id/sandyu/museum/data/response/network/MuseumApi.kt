package id.sandyu.museum.data.response.network

import id.sandyu.museum.BuildConfig
import id.sandyu.museum.data.response.CollectionResponse
import id.sandyu.museum.data.response.DetailsResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

internal interface MuseumApi {

    @GET("/api/{lang}/collection?key=t4PWrZYT&format=json&imgonly=true")
    fun getCollections(@Path("lang") lang: String = "en",
                       @Query("p") page: Int = 1,
                       @QueryMap map: Map<String, String>): Single<CollectionResponse>

    @GET("/api/{lang}/collection/{id}?key=t4PWrZYT&format=json")
    fun getCollection(@Path("id") id: String,
                      @Path("lang") lang: String = "en"): Single<DetailsResponse>

}