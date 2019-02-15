package id.sandyu.museum.data.response.network

import id.sandyu.museum.BuildConfig
import id.sandyu.museum.model.CollectionResponse
import id.sandyu.museum.model.DetailResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface MuseumApi {

    @GET("collection/?key=${BuildConfig.API_KEY}&format=json")
    fun getCollections(@Query("p") Page: Int): Single<CollectionResponse>


    @GET("collection/${BuildConfig.id}?key=${BuildConfig.API_KEY}&format=json")
    fun getDetails(@Query("object-number") ObjectNumber: String) : Single<DetailResponse>



}