package com.anggit97.abstraction.util.ext

import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by Anggit Prayogo on 4/30/20.
 */
fun ImageView.showImage(url: String) {
    Glide.with(context.applicationContext)
        .load(url)
        .into(this)
}

fun ImageView.showImage(drawable: Int) {
    Glide.with(context.applicationContext)
        .load(drawable)
        .into(this)
}