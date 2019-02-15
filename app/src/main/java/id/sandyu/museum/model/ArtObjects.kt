package id.sandyu.museum.model

import com.google.gson.annotations.SerializedName

data class ArtObjects(
    @SerializedName("links")val links: Links,
    @SerializedName("id")val id: String,
    @SerializedName("title")val title: String,
    @SerializedName("hasImage")val hasImage: Boolean,
    @SerializedName("showImage")val showImage: Boolean,
    @SerializedName("principalOrFirstMaker")val maker: String,
    @SerializedName("webImage")val webImage: WebImage,
    @SerializedName("headerImage")val headerImage: HeaderImage
) {
    data class Links(
        @SerializedName("self")val Self: String,
        @SerializedName("web")val Web: String
    )

    data class WebImage(
        @SerializedName("guid")val guid: String,
        @SerializedName("offsetPercentageX")val offsetPercentageX: Int,
        @SerializedName("offsetPercentageY")val offsetPercentageY: Int,
        @SerializedName("width")val width: Int,
        @SerializedName("height")val height: Int,
        @SerializedName("url")val collection: String
    )

    data class HeaderImage(
        @SerializedName("url")val url: String
    )


}