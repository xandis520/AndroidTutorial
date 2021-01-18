package com.example.androidtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    private lateinit var blogAdapter: BlogRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }

    private fun initRecyclerView(){

        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@RecyclerActivity)
            val topSpacingDecoration = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecoration)
            blogAdapter = BlogRecyclerAdapter()
            adapter = blogAdapter
        }
//        recycler_view.layoutManager = LinearLayoutManager(this@RecyclerActivity)
//        blogAdapter = BlogRecyclerAdapter()
//        recycler_view.adapter = blogAdapter
    }
}