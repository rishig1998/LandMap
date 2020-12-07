package com.example.landmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_detail.*
import android.content.Intent as Intent1
import android.content.Intent as Intent2

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val intent=intent
        val name=intent.getStringExtra("name")

        textView.text=name

        val chose=Global.Chose

        val setImage=chose.chooseImage

        imageView2.setImageBitmap(setImage)

    }

}