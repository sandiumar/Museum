package id.sandyu.museum.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import id.sandyu.museum.model.ArtObjects

class ItemMuseumViewModel(model: ArtObjects): ViewModel() {
    var title: ObservableField<String> = ObservableField()
    var principalOrFirstMaker: ObservableField<String> = ObservableField()
    var url: ObservableField<String> = ObservableField()

    init {
        title.set(model.title)
        principalOrFirstMaker.set(model.maker)
        url.set(model.webImage.collection)

    }
} 