package id.sandyu.museum.converter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("app:webImage")
    fun webImage(imageView: ImageView, url: String){
        Picasso.get().load(url).into(imageView)
    }


}