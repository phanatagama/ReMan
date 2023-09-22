package com.example.myrecyclerview.ui.about.view

import android.annotation.SuppressLint
import android.content.Context
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.myrecyclerview.R
import com.example.myrecyclerview.data.model.Project
import com.example.myrecyclerview.utils.KotlinEpoxyHolder

@SuppressLint("NonConstantResourceId")
@EpoxyModelClass(layout = R.layout.layout_project_item)
abstract class ProjectView(private val context: Context) : EpoxyModelWithHolder<ProjectView.Holder>() {

    @EpoxyAttribute
    lateinit var model: Project

    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.nameTv.text = model.name
        holder.descriptionTv.text = model.description
        holder.starsTv.text = context.getString(R.string.profile_item_stars, model.stars.toString())
        holder.languageTv.text = context.getString(R.string.profile_item_language, model.language)
        holder.issuesTv.text = context.getString(R.string.profile_item_issues, model.issues.toString())
    }
    inner class Holder : KotlinEpoxyHolder() {
        val nameTv by bind<TextView>(R.id.project_name_tv)
        val descriptionTv by bind<TextView>(R.id.project_description_tv)
        val starsTv by bind<TextView>(R.id.project_stars_tv)
        val languageTv by bind<TextView>(R.id.project_language_tv)
        val issuesTv by bind<TextView>(R.id.project_issues_tv)
    }
}

