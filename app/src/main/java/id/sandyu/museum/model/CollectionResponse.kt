package id.sandyu.museum.model

import com.google.gson.annotations.SerializedName


data class CollectionResponse(
    @SerializedName("countFacets") val countFacets : CountFacet,
    @SerializedName("artObjects") val artObject: List<ArtObject>
){
    data class CountFacet(
        @SerializedName("hasimage") val totalImage : Int,
        @SerializedName("ondisplay") val totalDisplay : Int
    )



}