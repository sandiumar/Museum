package id.sandyu.museum.data.response.network

import id.sandyu.museum.BuildConfig
import id.sandyu.museum.model.CollectionResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface MuseumApi {

    @GET("collection/key=${BuildConfig.API_KEY}&format=json")
    fun getCollections(@Query("p") Page: String): Single<CollectionResponse>


}