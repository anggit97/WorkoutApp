package com.anggit97.workoutapp

import android.R
import android.app.Application
import com.anggit97.data.FontConfig
import io.github.inflationx.calligraphy3.CalligraphyConfig
import io.github.inflationx.calligraphy3.CalligraphyInterceptor
import io.github.inflationx.viewpump.ViewPump


/**
 * Created by Anggit Prayogo on 4/26/20.
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initFontConfig()
    }

    private fun initFontConfig() {
        ViewPump.init(
            ViewPump.builder()
                .addInterceptor(
                    CalligraphyInterceptor(
                        CalligraphyConfig.Builder()
                            .setDefaultFontPath(FontConfig.FONT_NORMAL)
                            .setFontAttrId(R.attr.fontFamily)
                            .build()
                    )
                )
                .build()
        )
    }
}