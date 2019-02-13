package id.sandyu.museum.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

class BindingConverter {
    companion object {

        @JvmStatic
        @BindingAdapter("loadImage")
        fun loadImage(imageView: ImageView, url: String){
            Picasso.get().load("https://lh5.ggpht.com/" +url).into(imageView)
        }
    }
}