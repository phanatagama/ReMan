package com.example.myrecyclerview.ui.about

import android.content.Context
import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.CarouselModel_
import com.airbnb.epoxy.EpoxyController
import com.example.myrecyclerview.data.model.Project
import com.example.myrecyclerview.ui.about.view.HeaderView_
import com.example.myrecyclerview.ui.about.view.ProjectView_

class ProjectController(private val context: Context) : EpoxyController() {
    private val project: MutableList<Project> = mutableListOf()
    private val projectFavorite: MutableList<Project> = mutableListOf()

    fun setProjectFavorite(data: List<Project>) {
        this.projectFavorite.clear()
        this.projectFavorite.addAll(data)
        requestModelBuild()
    }
    fun setProject(data: List<Project>) {
        this.project.clear()
        this.project.addAll(data)
        requestModelBuild()
    }

    override fun buildModels() {
        HeaderView_()
            .id("header.my.projects")
            .title("My Repositories")
            .addIf(this.project.isNotEmpty(), this)

        CarouselModel_()
            .padding(Carousel.Padding.dp(16, 2, 16, 2, 8))
            .id("carousel.java.trending.projects")
            .models(
                this.project.map {
                    ProjectView_(context).id(it.id).model(it)
                }
            )
            .addIf(this.project.isNotEmpty(),this)

        HeaderView_()
            .id("header.my.projects.favorite")
            .title("My Favorite")
            .addIf(this.projectFavorite.isNotEmpty(), this)

        CarouselModel_()
            .padding(Carousel.Padding.dp(16, 2, 16, 2, 8))
            .id("carousel.java.trending.projects")
            .models(
                this.projectFavorite.map {
                    ProjectView_(context).id(it.id).model(it)
                }
            )
            .addIf(this.projectFavorite.isNotEmpty(),this)
    }

}