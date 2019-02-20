package id.sandyu.museum.model

import com.google.gson.annotations.SerializedName

data class DetailResponse (
    @SerializedName("artObject")val artObject: List<ArtObjectDetail>,
    @SerializedName("artObjectPage")val artObjectPage: ArtObjectPage
){
    data class ArtObjectPage(
        @SerializedName("objectNumber")val objectNumber: String,
        @SerializedName("plaqueDescription")val description: String
    )


}