package com.example.myrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvComic: RecyclerView
    private var list: ArrayList<Comic> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvComic = findViewById(R.id.rv_comic)
        rvComic.setHasFixedSize(true)

        list.addAll(ComicsData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvComic.layoutManager = LinearLayoutManager(this)
        val listComicAdapter = ListComicAdapter(list)
        rvComic.adapter = listComicAdapter

        listComicAdapter.setOnItemClickCallback(object : ListComicAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Comic) {
                showSelectedHero(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showSelectedHero(comic: Comic) {
        val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_TITLE, comic.title)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_DETAIL, comic.detail)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_IMG, comic.photo)
        startActivity(moveWithDataIntent)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}