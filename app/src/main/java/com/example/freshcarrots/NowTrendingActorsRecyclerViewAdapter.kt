package com.example.freshcarrots

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners


/**
 * [RecyclerView.Adapter] that can display a [NowPlayingMovie] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 */
class NowTrendingActorsRecyclerViewAdapter(
    private val actors: List<NowTrendingActor>,
    private val mListener: OnListFragmentInteractionListener2?
)
    : RecyclerView.Adapter<NowTrendingActorsRecyclerViewAdapter.ActorViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_now_trending_actor, parent, false)
        return ActorViewHolder(view)
    }

    /**
     * This inner class lets us refer to all the different View elements
     * (Yes, the same ones as in the XML layout files!)
     */
    inner class ActorViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var mItem: NowTrendingActor? = null
        val mActorName: TextView = mView.findViewById<View>(R.id.actor_name) as TextView
        val mActorProfile: ImageView = mView.findViewById<View>(R.id.actor_profile) as ImageView



        override fun toString(): String {
            return mActorName.toString()
        }
    }

    /**
     * This lets us "bind" each Views in the ViewHolder to its' actual data!
     */
    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        val actor = actors[position]

        holder.mItem = actor
        holder.mActorName.text = actor.name + " "



        Glide.with(holder.mView)
            .load("https://image.tmdb.org/t/p/w500/" + actor.profile)
            .placeholder(R.drawable.carrot)
            .centerCrop().transform(RoundedCorners(50))
            .into(holder.mActorProfile)


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
        return actors.size
    }


}