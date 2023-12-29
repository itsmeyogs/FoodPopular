package com.yogi.foodpopular

import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val photoDetail:ImageView = findViewById(R.id.detail_photo)
        val nameDetail:TextView = findViewById(R.id.detail_name)
        val descDetail:TextView = findViewById(R.id.detail_desc)
        val historyDetail:TextView = findViewById(R.id.detail_history)

        val dataFood = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra<Food>("key_food", Food::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<Food>("key_food")
        }

        if (dataFood != null){
            Glide.with(this)
                .load(dataFood.photo) // URL Gambar
                .into(photoDetail) // imageView mana yang akan diterapkan
            nameDetail.text= dataFood.name
            descDetail.text= dataFood.description
            historyDetail.text= dataFood.history




        }

    }
}