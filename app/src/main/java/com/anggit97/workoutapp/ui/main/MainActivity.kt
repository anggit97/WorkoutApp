package com.anggit97.workoutapp.ui.main

import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.anggit97.abstraction.activity.BaseActivity
import com.anggit97.workoutapp.databinding.ActivityMainBinding
import com.anggit97.workoutapp.ui.report.ReportFragment
import com.anggit97.workoutapp.ui.workoutarealist.WorkoutAreaListFragment

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainPagerAdapter: MainPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupTab()
    }

    private fun setupTab() {
        setupViewPager(binding.viewPager)
        binding.tabMenu.setupWithViewPager(binding.viewPager)
    }

    private fun setupViewPager(viewPager: ViewPager) {
        mainPagerAdapter = MainPagerAdapter(supportFragmentManager)
        mainPagerAdapter.addFragment(WorkoutAreaListFragment(), "Workout")
        mainPagerAdapter.addFragment(ReportFragment(), "Report")
        mainPagerAdapter.addFragment(WorkoutAreaListFragment(), "Activity")
        viewPager.adapter = mainPagerAdapter
        viewPager.offscreenPageLimit = 3
    }
}
