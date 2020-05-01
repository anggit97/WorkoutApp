package com.anggit97.abstraction.util.ext

import android.view.View

/**
 * Created by Anggit Prayogo on 5/1/20.
 */
fun View.setGone(){
    this.visibility = View.GONE
}

fun View.setInvisible(){
    this.visibility = View.INVISIBLE
}

fun View.setVisible(){
    this.visibility = View.VISIBLE
}