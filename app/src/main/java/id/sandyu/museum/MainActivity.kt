package id.sandyu.museum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import id.sandyu.museum.adapters.MuseumAdapter
import id.sandyu.museum.model.CollectionResponse
import id.sandyu.museum.databinding.ActivityMainBinding
import id.sandyu.museum.viewmodel.MainViewModel
import io.reactivex.SingleObserver
import io.reactivex.disposables.Disposable

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    private lateinit var adapter: MuseumAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.viewModel = mainViewModel

        setRecyclerView()

        mainViewModel.getCollection()


    }

    //Menampilkan data Collection yg telah diolah oleh MainViewModel
    private fun setRecyclerView(){
        val layoutManager = LinearLayoutManager(this)
        binding.mainRecyclerView.layoutManager = layoutManager
        adapter = MuseumAdapter{
            val intent = Intent(this, DetailCollectionActivity::class.java)
            it.let {
                val bundle = Bundle().apply {
                    putParcelable("ArtObject",it)
                }
                intent.putExtra("ArtBundle", bundle)
            }
            startActivity(intent)
        }
        binding.mainRecyclerView.adapter = adapter

        mainViewModel.musium.observe(this, Observer { list ->
            adapter.setData(list)
            adapter.notifyDataSetChanged()
        })
    }
}