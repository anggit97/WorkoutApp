package com.anggit97.workoutapp.ui.boarding

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.anggit97.abstraction.activity.BaseActivity
import com.anggit97.workoutapp.databinding.ActivityBoardingBinding


class BoardingActivity : BaseActivity() {

    private lateinit var sectionPagerAdapter: SectionPagerAdapter

    private lateinit var binding: ActivityBoardingBinding

    private var page = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        manageStatusBarToTransparent()
        binding = ActivityBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initPagerAdapter()

        manageTransitionViewPager()
    }

    private fun initPagerAdapter() {
        sectionPagerAdapter = SectionPagerAdapter(supportFragmentManager)
        binding.viewPager.adapter = sectionPagerAdapter
    }

    private fun manageTransitionViewPager() {
        binding.viewPager.currentItem = page
        binding.viewPager.addOnPageChangeListener(viewPagerChangeListener)
    }

    private val viewPagerChangeListener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {

        }

        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {

        }

        override fun onPageSelected(position: Int) {
            page = position
        }
    }

    private fun manageStatusBarToTransparent() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.decorView.systemUiVisibility = (
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
            window.statusBarColor = ContextCompat.getColor(this, android.R.color.transparent)
        }
    }
}
