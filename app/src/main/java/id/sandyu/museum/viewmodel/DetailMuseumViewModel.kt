package id.sandyu.museum.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import id.sandyu.museum.model.DetailResponse

class DetailMuseumViewModel(model: DetailResponse.ArtObjectPage) : ViewModel() {
    var description: ObservableField<String> =  ObservableField()

    init {
        description.set(model.description)
    }
}