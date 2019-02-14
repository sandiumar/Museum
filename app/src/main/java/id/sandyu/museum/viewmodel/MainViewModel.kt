package id.sandyu.museum.viewmodel

import android.app.Application
import android.util.Log

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.sandyu.museum.data.response.network.MuseumRetrofit
import id.sandyu.museum.model.ArtObject
import id.sandyu.museum.model.CollectionResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainViewModel:ViewModel() {



    var musium = MutableLiveData<List<ArtObject>>()
    var error: MutableLiveData<Throwable> = MutableLiveData()


    //Mengambil data collection menggunakan RxJava2 & Retrofit 2
    private val museumApi = MuseumRetrofit.create()
    fun getCollection(){
        museumApi.getCollections(1)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({response ->
                musium.postValue(response.artObject)
                response.artObject
                Log.d("viewModelResponse", "jumlah response: ${response.artObject.size}")
            },{
                it.printStackTrace()
            })
    }

}