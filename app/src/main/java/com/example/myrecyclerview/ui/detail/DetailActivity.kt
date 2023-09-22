package com.example.myrecyclerview.ui.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade
import com.bumptech.glide.request.RequestOptions
import com.example.myrecyclerview.R
import com.google.android.material.appbar.CollapsingToolbarLayout

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        setTheme(R.style.Theme_MyRecyclerView)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


//        supportActionBar?.title = "Detail Komik"
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        bindViews()
    }

    private fun bindViews() {
        val imgCover: ImageView = findViewById(R.id.img_item_photo)
        val tvTitle: TextView = findViewById(R.id.tv_item_name)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val btnFavorite: Button = findViewById(R.id.btn_set_favorite)
        val btnShare: Button = findViewById(R.id.action_share)

        val img = intent.getIntExtra(EXTRA_IMG, 0)
        val title = intent.getStringExtra(EXTRA_TITLE)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val info = intent.getStringExtra(EXTRA_INFO)

        val collapseLayout = findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar)
        collapseLayout.title = title
        collapseLayout.setExpandedTitleColor(ContextCompat.getColor(this, R.color.white))
        collapseLayout.setCollapsedTitleTextColor(ContextCompat.getColor(this,R.color.white))

        tvTitle.text = info
        tvDetail.text = detail
        Glide.with(this)
            .load(img)
            .transition(withCrossFade())
            .apply(RequestOptions().transform())
            .into(imgCover)
        btnFavorite.setOnClickListener {
            Toast.makeText(this, "Favorit " + title, Toast.LENGTH_SHORT).show()
        }
        btnShare.setOnClickListener {
            val shareIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Judul: $title \nSinopsis: $detail")
                type = "text/plain"
            }
            startActivity(Intent.createChooser(shareIntent, "Share comic to.."))
        }
    }

    companion object {
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_INFO = "extra_info"
    }
}