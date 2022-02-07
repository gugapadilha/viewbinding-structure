package com.example.viewbindingstructure.recyclerviewexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.viewbindingstructure.R
import com.example.viewbindingstructure.databinding.ResItemLiveBinding
import com.example.viewbindingstructure.recyclerviewexample.models.Live

class LiveAdapter(private val onItemClicked : (Live) -> Unit) :
                  RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items : List<Live> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val binding = ResItemLiveBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LiveViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){

            is LiveViewHolder -> {
                holder.bind(items[position], onItemClicked)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(lives : List<Live>){
        this.items = lives
    }

    inner class LiveViewHolder(
        itemView: ResItemLiveBinding, //preciso passar essa implementaçao do ViewHolder nessa classe tbm.
    ) : RecyclerView.ViewHolder(itemView.root ){

        private val liveTitle = itemView.title //ta vindo do synthetics
        private val liveAuthor = itemView.author
        private val liveThumbnail = itemView.thumbnail

        //a funcao bind pega as informacoes da model que vou passar pra ele e coloca no layout do item do RecyclerView
        fun bind(live : Live, onItemClicked: (Live) -> Unit) {

            liveTitle.text = live.title //chamando pelo viewBinding
            liveAuthor.text = live.author //chamando pelo viewBinding

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(live.thumbanilUrl)
                .into(liveThumbnail)

            itemView.setOnClickListener {
                onItemClicked(live)
            }

        }

    }
}