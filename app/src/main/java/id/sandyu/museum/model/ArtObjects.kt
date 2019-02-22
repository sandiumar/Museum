package id.sandyu.museum.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize

data class ArtObjects(

    @SerializedName("links")val links: Links,
    @SerializedName("id")val id: String,
    @SerializedName("title")val title: String,
    @SerializedName("longTitle")val description: String,
    @SerializedName("principalOrFirstMaker")val maker: String,
    @SerializedName("webImage")val webImage: WebImage,
    @SerializedName("headerImage")val headerImage: HeaderImage
): Parcelable {

    @Parcelize
    data class Links(
        @SerializedName("self")val Self: String,
        @SerializedName("web")val Web: String
    ) : Parcelable

    @Parcelize
    data class WebImage(
        @SerializedName("url")val url: String
    ) : Parcelable

    @Parcelize
    data class HeaderImage(
        @SerializedName("url")val detail: String
    ) : Parcelable


}