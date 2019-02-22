package id.sandyu.museum


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import id.sandyu.museum.databinding.ActivityDetailCollectionBinding
import id.sandyu.museum.model.ArtObjects


/**
 * A simple [Fragment] subclass.
 *
 */
class DetailCollectionActivity: AppCompatActivity() {

    private lateinit var binding: ActivityDetailCollectionBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bundle = intent.getBundleExtra("ArtBundle")
        val artObject = bundle.getParcelable<ArtObjects>("ArtObject")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_collection)
        binding.artObject = artObject

        setSupportActionBar(binding.toolbar)
    }

}
