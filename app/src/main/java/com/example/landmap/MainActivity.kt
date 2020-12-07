package com.example.landmap

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.media.MediaMetadataRetriever
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList



class MainActivity : AppCompatActivity() {
    lateinit var arrayList: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrayList= arrayListOf("India","UnitedKigdum","Lundun","Irak","France")
        val india =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.india)

        val uk=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.united)
        val lundun=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.lundun)
        val irak=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.irak)
        val france=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.france)
        var landimage=ArrayList<Bitmap>()

        landimage= arrayListOf(india,lundun,irak,france)

        val arrayAdapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList)

        listview.adapter=arrayAdapter


        listview.onItemClickListener=AdapterView.OnItemClickListener{ adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->
            var intent=Intent(applicationContext,Detail::class.java)
            intent.putExtra("name",arrayList[i])
            startActivity(intent)

        }



    }
}