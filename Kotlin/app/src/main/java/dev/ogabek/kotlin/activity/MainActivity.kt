package dev.ogabek.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.adaptere.PostAdapter
import dev.ogabek.kotlin.adaptere.StoryAdapter
import dev.ogabek.kotlin.model.Post
import dev.ogabek.kotlin.model.Story

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerFeed: RecyclerView
    private lateinit var recyclerStory: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerFeed = findViewById(R.id.recyclerFeed)
        recyclerStory = findViewById(R.id.recyclerStory)
        recyclerFeed.setLayoutManager(GridLayoutManager(this, 1))
        recyclerStory.setLayoutManager(
            GridLayoutManager(
                this,
                1,
                GridLayoutManager.HORIZONTAL,
                false
            )
        )
        refreshFeedAdapter(allPosts())
        refreshStoryAdapter(allStories())
    }

    private fun refreshFeedAdapter(posts: ArrayList<Post>) {
        recyclerFeed.adapter = PostAdapter(posts)
    }

    private fun refreshStoryAdapter(stories: ArrayList<Story>) {
        recyclerStory.adapter = StoryAdapter(stories)
    }

    private fun allPosts(): ArrayList<Post> {
        val posts: ArrayList<Post> = ArrayList<Post>()
        posts.add(Post(R.drawable.user_ogabekdev, "Ogabek Matyakubov", R.drawable.post_1, R.drawable.post_2))
        posts.add(Post(R.drawable.user_bogibek, "Bogibek Matyaqubov", R.drawable.post_2, R.drawable.post_3))
        posts.add(Post(R.drawable.user_elmurod, "Elmurod Nazirov", R.drawable.post_3, R.drawable.post_1))
        posts.add(Post(R.drawable.user_kamron, "Kamron", R.drawable.post_1, R.drawable.post_2))
        posts.add(Post(R.drawable.user_ogabekdev, "Ogabek Matyakubov", R.drawable.post_2, R.drawable.post_3))
        posts.add(Post(R.drawable.user_bogibek, "Bogibek Matyaqubov", R.drawable.post_3, R.drawable.post_1))
        posts.add(Post(R.drawable.user_elmurod, "Elmurod Nazirov", R.drawable.post_1, R.drawable.post_2))
        posts.add(Post(R.drawable.user_kamron, "Kamron", R.drawable.post_2, R.drawable.post_3))
        posts.add(Post(R.drawable.user_ogabekdev, "Ogabek Matyakubov", R.drawable.post_3, R.drawable.post_1))
        posts.add(Post(R.drawable.user_ogabekdev, "Ogabek Matyakubov", R.drawable.post_1, R.drawable.post_2))
        posts.add(Post(R.drawable.user_bogibek, "Bogibek Matyaqubov", R.drawable.post_2, R.drawable.post_3))
        posts.add(Post(R.drawable.user_elmurod, "Elmurod Nazirov", R.drawable.post_3, R.drawable.post_1))
        posts.add(Post(R.drawable.user_kamron, "Kamron", R.drawable.post_1, R.drawable.post_2))
        posts.add(Post(R.drawable.user_ogabekdev, "Ogabek Matyakubov", R.drawable.post_2, R.drawable.post_3))
        posts.add(Post(R.drawable.user_bogibek, "Bogibek Matyaqubov", R.drawable.post_3, R.drawable.post_1))
        posts.add(Post(R.drawable.user_elmurod, "Elmurod Nazirov", R.drawable.post_1, R.drawable.post_2))
        posts.add(Post(R.drawable.user_kamron, "Kamron", R.drawable.post_2, R.drawable.post_3))
        posts.add(Post(R.drawable.user_ogabekdev, "Ogabek Matyakubov", R.drawable.post_3, R.drawable.post_1))
        return posts
    }
    private fun allStories(): ArrayList<Story> {
        val stories: ArrayList<Story> = ArrayList<Story>()
        stories.add(Story(R.drawable.user_ogabekdev, "Ogabek"))
        stories.add(Story(R.drawable.user_bogibek, "Bogibek"))
        stories.add(Story(R.drawable.user_elmurod, "Elmurod"))
        stories.add(Story(R.drawable.user_kamron, "Kamron"))
        stories.add(Story(R.drawable.user_ogabekdev, "Ogabek"))
        stories.add(Story(R.drawable.user_bogibek, "Bogibek"))
        stories.add(Story(R.drawable.user_elmurod, "Elmurod"))
        stories.add(Story(R.drawable.user_kamron, "Kamron"))
        stories.add(Story(R.drawable.user_ogabekdev, "Ogabek"))
        stories.add(Story(R.drawable.user_bogibek, "Bogibek"))
        stories.add(Story(R.drawable.user_elmurod, "Elmurod"))
        stories.add(Story(R.drawable.user_kamron, "Kamron"))
        stories.add(Story(R.drawable.user_ogabekdev, "Ogabek"))
        stories.add(Story(R.drawable.user_bogibek, "Bogibek"))
        stories.add(Story(R.drawable.user_elmurod, "Elmurod"))
        stories.add(Story(R.drawable.user_kamron, "Kamron"))
        return stories
    }
}