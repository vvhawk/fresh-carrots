package com.example.freshcarrots

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


/**
 * [RecyclerView.Adapter] that can display a [NowPlayingMovie] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 */
class NowPlayingShowsRecyclerViewAdapter(
    private val shows: List<NowPlayingShow>,
    private val mListener: OnListFragmentInteractionListener3?
)
    : RecyclerView.Adapter<NowPlayingShowsRecyclerViewAdapter.ShowViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_now_playing_show, parent, false)
        return ShowViewHolder(view)
    }

    /**
     * This inner class lets us refer to all the different View elements
     * (Yes, the same ones as in the XML layout files!)
     */
    inner class ShowViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var mItem: NowPlayingShow? = null
        val mShowTitle: TextView = mView.findViewById<View>(R.id.show_title) as TextView
        val mShowOverview: TextView = mView.findViewById<View>(R.id.show_overview) as TextView
        val mShowPoster: ImageView = mView.findViewById<View>(R.id.show_poster) as ImageView



        override fun toString(): String {
            return mShowTitle.toString()
        }
    }

    /**
     * This lets us "bind" each Views in the ViewHolder to its' actual data!
     */
    override fun onBindViewHolder(holder: ShowViewHolder, position: Int) {
        val show = shows[position]

        holder.mItem = show
        holder.mShowTitle.text = show.title + " "
        holder.mShowOverview.text = show.overview


        Glide.with(holder.mView)
            .load("https://image.tmdb.org/t/p/w500/" + show.poster)
            .placeholder(R.drawable.carrot)
            .centerInside()
            .into(holder.mShowPoster)


        holder.mView.setOnClickListener {
            holder.mItem?.let { book ->
                mListener?.onItemClick(book)
            }
        }
    }

    /**
     * Remember: RecyclerView adapters require a getItemCount() method.
     */
    override fun getItemCount(): Int {
        return shows.size
    }
}