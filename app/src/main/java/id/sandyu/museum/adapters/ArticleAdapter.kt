package id.sandyu.museum.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import id.sandyu.museum.R
import id.sandyu.museum.model.ArtObjectDetail

class ArticleAdapter(val context: Context) : RecyclerView.Adapter<ArticleAdapter.ViewHolder>() {

    protected val detail: List<ArtObjectDetail> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleAdapter.ViewHolder {
        val binding: DetailMuseumBinding = DataBindingUtil.inflate(LayoutInflater.from(context),
            R.layout.fragment_detail_collection, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return detail.size
    }
}