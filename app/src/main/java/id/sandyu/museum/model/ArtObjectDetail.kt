package id.sandyu.museum.model

import com.google.gson.annotations.SerializedName

data class ArtObject(
    @SerializedName("links")val links: Links,
    @SerializedName("id")val id: String,
    @SerializedName("priref")val priref: Int,
    @SerializedName("objectNumber")val objectNumber: String,
    @SerializedName("title")val title: String,
    @SerializedName("copyrightHolder")var copyrightHolder: String?,
    @SerializedName("webImage")var webImage: WebImage,
    @SerializedName("principalMakers")var principalMakers: PrincipalMakers
){
    data class Links(
        @SerializedName("search")val search: String
    )

    data class WebImage(
        @SerializedName("url")val url: String
    )

    data class PrincipalMakers(
        @SerializedName("plaqueDescriptionDutch")val plaqueDescriptionDutch: String,
        @SerializedName("plaqueDescriptionEnglish")val plaqueDescriptionEnglish: String,
        @SerializedName("principalMaker")val principalMaker: String
    )
}