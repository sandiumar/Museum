package id.sandyu.museum.model

import com.google.gson.annotations.SerializedName

data class ArtObject(
    @SerializedName("links")val links: Links,
    @SerializedName("id")val id: String,
    @SerializedName("title")val title: String,
    @SerializedName("principalOrFirstMaker")val maker: String,
    @SerializedName("webImage")val webImage: WebImage,
    @SerializedName("headerImage")val headerImage: HeaderImage
) {
    data class Links(
        @SerializedName("self")val Self: String,
        @SerializedName("web")val Web: String
    )

    data class WebImage(
        @SerializedName("url")val url: String
    )

    data class HeaderImage(
        @SerializedName("url")val url: String
    )


}