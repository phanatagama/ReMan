package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.title = "About Me"

        var profile: ImageView = findViewById(R.id.profile)
        Glide.with(this)
            .load(R.drawable.profile)
            .apply(RequestOptions().override(100, 100))
            .into(profile)
    }
}