package id.sandyu.museum.model

import com.google.gson.annotations.SerializedName

data class DetailResponse (
    @SerializedName("artObject")val artObject: ArtObject,
    @SerializedName("artObjectPage")val artObjectPage: ArtObject
)