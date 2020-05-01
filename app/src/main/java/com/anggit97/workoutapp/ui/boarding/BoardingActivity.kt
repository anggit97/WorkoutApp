package com.anggit97.workoutapp.ui.boarding

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.anggit97.abstraction.activity.BaseActivity
import com.anggit97.abstraction.util.ext.setGone
import com.anggit97.abstraction.util.ext.setVisible
import com.anggit97.abstraction.util.ext.showImage
import com.anggit97.workoutapp.R
import com.anggit97.workoutapp.databinding.ActivityBoardingBinding
import com.anggit97.workoutapp.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_boarding.*
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.newTask
import org.jetbrains.anko.startActivity


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

        indicatorClickListener()

        btnNextClickListener()

        skipOnClickListener()
    }

    private fun skipOnClickListener() {
        binding.tvSkip.setOnClickListener {
            startActivity(intentFor<MainActivity>().clearTask().newTask())
        }
    }

    private fun btnNextClickListener() {
        binding.btnNext.setOnClickListener {
            if (page == 2) {
                startActivity(intentFor<MainActivity>().clearTask().newTask())
                return@setOnClickListener
            }

            page += 1
            binding.viewPager.currentItem = page
        }
    }

    private fun indicatorClickListener() {
        binding.introIndicator0.setOnClickListener {
            page = 0
            binding.viewPager.currentItem = page
        }

        binding.introIndicator1.setOnClickListener {
            page = 1
            binding.viewPager.currentItem = page
        }

        binding.introIndicator2.setOnClickListener {
            page = 2
            binding.viewPager.currentItem = page
        }
    }

    private fun initPagerAdapter() {
        sectionPagerAdapter = SectionPagerAdapter(supportFragmentManager)
        binding.viewPager.adapter = sectionPagerAdapter
    }

    private fun manageTransitionViewPager() {
        binding.viewPager.currentItem = page
        binding.viewPager.addOnPageChangeListener(viewPagerChangeListener)
        binding.viewPager.setPageTransformer(false, BoardingPageTransformer())
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
            tvStartWorkout.setGone()
            when (page) {
                0 -> {
                    binding.btnNext.setImageResource(R.drawable.ic_arrow_forward_white_24dp)
                    boarding1Active()
                }
                1 -> {
                    binding.btnNext.setImageResource(R.drawable.ic_arrow_forward_white_24dp)
                    boarding2Active()
                }
                2 -> {
                    tvStartWorkout.setVisible()
                    binding.btnNext.setImageResource(R.drawable.shoes)
                    boarding3Active()
                }
            }
        }
    }

    private fun boarding3Active() {
        binding.introIndicator0.showImage(R.drawable.indicator_unselected)
        binding.introIndicator1.showImage(R.drawable.indicator_unselected)
        binding.introIndicator2.showImage(R.drawable.indicator_selected)
    }

    private fun boarding2Active() {
        binding.introIndicator0.showImage(R.drawable.indicator_unselected)
        binding.introIndicator1.showImage(R.drawable.indicator_selected)
        binding.introIndicator2.showImage(R.drawable.indicator_unselected)
    }

    private fun boarding1Active() {
        binding.introIndicator0.showImage(R.drawable.indicator_selected)
        binding.introIndicator1.showImage(R.drawable.indicator_unselected)
        binding.introIndicator2.showImage(R.drawable.indicator_unselected)
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
