package com.example.finstagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.parse.ParseFile;
import com.parse.ParseUser;

import com.example.finstagram.TimeFormatter;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {

    private Context context;
    private List<Post> posts;

    public PostsAdapter(Context context, List<Post>posts) {
        this.context = context;
        this.posts = posts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.bind(post);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private String likes = "%d Likes";
        private ImageView ivPfp;
        private TextView tvUsername;
        private ImageView ivPicture;
        private TextView tvLikes;
        private TextView tvCaption;
        private TextView tvTimeStamp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPfp = itemView.findViewById(R.id.ivPfp);
            tvUsername = itemView.findViewById(R.id.tvUsername);
            ivPicture = itemView.findViewById(R.id.ivPicture);
            tvLikes = itemView.findViewById(R.id.tvLikes);
            tvCaption = itemView.findViewById(R.id.tvCaption);
            tvTimeStamp = itemView.findViewById(R.id.tvTimestamp);
        }

        public void bind(Post post) {
            // Bind post data to view elements
            ParseUser author = post.getUser();
            ParseFile image = post.getImage();
            ParseFile pfp = post.getPfp(author);
            tvUsername.setText(author.getUsername());
            tvLikes.setText(String.format(likes, post.getLikes().intValue()));
            tvCaption.setText(post.getDescription());
            tvTimeStamp.setText(TimeFormatter.getTimeDifference(post.getCreatedAt()));
            if (image != null) {
                Glide.with(context).load(image.getUrl()).into(ivPicture);
            }
            if (pfp != null) {
                Glide.with(context).load(pfp.getUrl()).into(ivPfp);
            }
        }
    }
}
