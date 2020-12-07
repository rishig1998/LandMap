package com.example.landmap

import android.graphics.Bitmap

class Global {
    companion object Chose{
        var chooseImage:Bitmap?=null
        fun returnImage():Bitmap
        {
            return chooseImage!!

        }

    }

}