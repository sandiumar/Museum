package id.sandyu.museum.data.response

import com.squareup.moshi.Json

data class CollectionResponse(
    @Json(name = "artObjects") val artObjects: List<ArtObject>
)

data class ArtObject(
    @Json(name = "objectNumber") val objectNumber: String,
    @Json(name = "title") val title: String,
    @Json(name = "webImage") val webImage: WebImage,
    @Json(name = "headerImage") val headerImage: HeaderImage
)

data class HeaderImage(
    @Json(name = "url") val url: String
)

data class WebImage(
    @Json(name = "url") val url: String
)