package id.sandyu.museum.data.response

import com.google.gson.annotations.SerializedName
import id.sandyu.museum.model.ArtObject


data class CollectionResponse(
    @SerializedName("countFacets") val countFacets : CountFacet,
    @SerializedName("artObjects") val artObject: List<ArtObject>
){
    class CountFacet(
        @SerializedName("hasimage") val totalImage : Int,
        @SerializedName("ondisplay") val totalDisplay : Int
    )


}