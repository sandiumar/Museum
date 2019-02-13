package id.sandyu.museum.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import id.sandyu.museum.model.CollectionResponse

class MainViewModel(application: Application): AndroidViewModel(application) {

    var musium : MutableLiveData<CollectionResponse> = MutableLiveData()
    var error: MutableLiveData<Throwable> = MutableLiveData()

    fun getMuseum(){

    }



}