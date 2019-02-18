package id.sandyu.museum.converter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

class BindingConverter {
    companion object {

        @JvmStatic
        @BindingAdapter("webImage")
        fun webImage(imageView: ImageView, url:String){
            Picasso.get().load(url).into(imageView)
        }
    }
}