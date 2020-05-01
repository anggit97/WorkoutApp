package com.anggit97.workoutapp.ui.boarding

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.anggit97.workoutapp.R
import kotlin.math.abs

/**
 * Created by Anggit Prayogo on 5/1/20.
 */
class BoardingPageTransformer : ViewPager.PageTransformer {

    override fun transformPage(page: View, position: Float) {
        val pagePosition = page.tag as Int

        val pageWith = page.width.toFloat()
        val pageWidthTimesPosition  = pageWith * position
        val absPosition = abs(position)

        if (position <= -1.0f || position > 1.0f){

        }else if (position == 0.0f){

        }else{
            val image = page.findViewById<ImageView>(R.id.ivBoarding)
            val tvHeader = page.findViewById<TextView>(R.id.tvHeader)
            val tvSubHeader = page.findViewById<TextView>(R.id.tvSubheader)


            if (pagePosition == 0 && image != null) {
                image.alpha = 1.0f - absPosition
                image.translationX = -pageWidthTimesPosition * 1.5f

                tvHeader.alpha = 1.0f - absPosition
                tvHeader.translationX = -pageWidthTimesPosition * 1.3f

                tvSubHeader.alpha = 1.0f - absPosition
                tvSubHeader.translationX = -pageWidthTimesPosition * 1.1f
            }
        }
    }
}