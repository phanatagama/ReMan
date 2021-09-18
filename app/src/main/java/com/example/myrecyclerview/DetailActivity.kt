package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_IMG = "extra_img"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        supportActionBar?.title = "Detail Komik"

        val imgCover: ImageView = findViewById(R.id.img_item_photo)
        val tvTitle: TextView = findViewById(R.id.tv_item_name)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val btnFavorite: Button = findViewById(R.id.btn_set_favorite)
        val btnShare: Button = findViewById(R.id.btn_set_share)

        val img = intent.getIntExtra(EXTRA_IMG,0)
        val title = intent.getStringExtra(EXTRA_TITLE)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        tvTitle.text = title
        tvDetail.text = detail
        Glide.with(this)
            .load(img)
            .apply(RequestOptions().override(100, 100))
            .into(imgCover)
        btnFavorite.setOnClickListener {
            Toast.makeText(this, "Favorit " + title, Toast.LENGTH_SHORT).show()
        }
    }
}