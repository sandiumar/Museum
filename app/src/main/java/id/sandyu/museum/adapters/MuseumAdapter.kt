package id.sandyu.museum.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import id.sandyu.museum.databinding.ItemMuseumBinding
import id.sandyu.museum.R
import id.sandyu.museum.model.ArtObjects

class MuseumAdapter(val context: Context) : RecyclerView.Adapter<MuseumAdapter.ViewHolder>(){

    protected var museum: List<ArtObjects> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MuseumAdapter.ViewHolder {
        val binding: ItemMuseumBinding = DataBindingUtil.inflate(LayoutInflater.from(context),
            R.layout.item_museum, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return museum.size
    }

    override fun onBindViewHolder(holder: MuseumAdapter.ViewHolder, position: Int) {
        holder.bindData(museum[holder.adapterPosition])
    }

    fun setData(museums: List<ArtObjects>){
        this.museum = museums
    }

    class ViewHolder(private val binding: ItemMuseumBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindData(model: ArtObjects){
           binding.itemMuseum = model
            binding.executePendingBindings()
        }
    }


}