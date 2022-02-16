package dev.ogabek.kotlin.adaptere

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.Post

class PostAdapter(var posts: List<Post>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_feed_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val post: Post = posts[position]
        if (holder is PostViewHolder) {
            holder.profile.setImageResource(post.profile)
            holder.postPhoto1.setImageResource(post.post1)
            holder.postPhoto2.setImageResource(post.post2)
            holder.fullName.setText(post.fullName)
        }
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    private class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var profile: ShapeableImageView = view.findViewById(R.id.iv_post_profile)
        var postPhoto1: ShapeableImageView = view.findViewById(R.id.iv_post_1)
        var postPhoto2: ShapeableImageView = view.findViewById(R.id.iv_post_2)
        var fullName: TextView = view.findViewById(R.id.tv_post_full_name)

    }

}