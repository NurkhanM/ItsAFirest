package lap.uno.app.itsinfoforest.info

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import lap.uno.app.itsinfoforest.R

class ViewPagerAdapter(private val data:Array<Int>) : RecyclerView.Adapter<ViewPagerAdapter.PagerViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        return PagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_pager, parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.bind(data[position])
    }

    inner class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)

        fun bind(data:Int){
            Glide.with(itemView.context).load(data).into(imageView)
        }
    }
}