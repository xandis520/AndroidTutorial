package com.example.androidtutorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.androidtutorial.models.BlogPost
import kotlinx.android.synthetic.main.recycler_blog_list.view.*

class BlogRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<BlogPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
           LayoutInflater.from(parent.context).inflate(R.layout.recycler_blog_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is BlogViewHolder ->{
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(blogList: List<BlogPost>){
        items = blogList 
    }

    class BlogViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val blogImage: ImageView = itemView.blog_image
        val blogTitle: TextView = itemView.blog_title
        val blogAuthor: TextView = itemView.blog_author

        fun bind(blogPost: BlogPost){
            blogTitle.setText(blogPost.title)
            blogAuthor.setText(blogPost.username)

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(blogPost.image)
                .into(blogImage)
        }
    }
}