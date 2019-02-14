package id.sandyu.museum.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import id.sandyu.museum.model.ArtObject
import id.sandyu.museum.model.CollectionResponse

class ItemMuseumViewModel(model: ArtObject): ViewModel() {
    var title: ObservableField<String> = ObservableField()
    var principalOrFirstMaker: ObservableField<String> = ObservableField()

    init {
        title.set(model.title)
        principalOrFirstMaker.set(model.maker)
    }
} 