package dev.ogabek.java.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.Post;

public class PostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Post> posts;

    public PostAdapter(List<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_feed_post, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Post post = posts.get(position);

        if (holder instanceof PostViewHolder) {
            ((PostViewHolder) holder).profile.setImageResource(post.getProfile());
            ((PostViewHolder) holder).postPhoto1.setImageResource(post.getPost1());
            ((PostViewHolder) holder).postPhoto2.setImageResource(post.getPost2());
            ((PostViewHolder) holder).fullName.setText(post.getFullName());
        }
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    private static class PostViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView profile, postPhoto1, postPhoto2;
        TextView fullName;

        public PostViewHolder(View view) {
            super(view);

            profile = view.findViewById(R.id.iv_post_profile);
            postPhoto1 = view.findViewById(R.id.iv_post_1);
            postPhoto2 = view.findViewById(R.id.iv_post_2);
            fullName = view.findViewById(R.id.tv_post_full_name);

        }
    }
}
