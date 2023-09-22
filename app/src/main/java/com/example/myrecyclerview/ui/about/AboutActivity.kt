package com.example.myrecyclerview.ui.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbnb.epoxy.EpoxyRecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myrecyclerview.R
import com.example.myrecyclerview.data.ProjectsData

class AboutActivity : AppCompatActivity() {
    private val projectController: ProjectController by lazy{ ProjectController(this)}
    private val projectController2: ProjectController by lazy{ ProjectController(this)}
    private lateinit var projectRecyclerView: EpoxyRecyclerView
    private lateinit var projectRecyclerView2: EpoxyRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.title = "About Me"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        bindViews()
    }

    private fun bindViews() {
        projectRecyclerView = findViewById<EpoxyRecyclerView>(R.id.project_rv)
        projectRecyclerView.layoutManager = LinearLayoutManager(this)
        projectRecyclerView.setItemSpacingDp(8)
        projectRecyclerView.setController(projectController)

        projectRecyclerView2 = findViewById<EpoxyRecyclerView>(R.id.project_rv2)
        projectRecyclerView2.layoutManager = LinearLayoutManager(this)
        projectRecyclerView2.setItemSpacingDp(8)
        projectRecyclerView2.setController(projectController2)

        projectController.setProject(ProjectsData.listData)
        projectController2.setProjectFavorite(ProjectsData.favoriteProject)

        val profile: ImageView = findViewById(R.id.profile)
        Glide.with(this)
            .load(R.drawable.profile)
            .apply(RequestOptions().override(200, 200))
            .into(profile)
    }
}