package com.anggit97.workoutapp.ui.main

import android.os.Bundle
import android.util.Log.e
import androidx.viewpager.widget.ViewPager
import com.anggit97.abstraction.activity.BaseActivity
import com.anggit97.workoutapp.databinding.ActivityMainBinding
import com.anggit97.workoutapp.ui.workoutlist.WorkoutListFragment

class MainActivity : BaseActivity() {

    private var binding: ActivityMainBinding? = null

    private lateinit var mainPagerAdapter: MainPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (binding != null){
            e("DATA ", "Binding")
        }else{
            e("DATA ", "Binding Not")
        }

        setupTab()
    }

    private fun setupTab() {
        binding?.viewPager?.let { setupViewPager(it) }
        binding?.tabMenu?.setupWithViewPager(binding?.viewPager)
    }

    private fun setupViewPager(viewPager: ViewPager) {
        mainPagerAdapter = MainPagerAdapter(supportFragmentManager)
        mainPagerAdapter.addFragment(WorkoutListFragment(), "Workout")
        mainPagerAdapter.addFragment(WorkoutListFragment(), "Report")
        mainPagerAdapter.addFragment(WorkoutListFragment(), "Activity")
        viewPager.adapter = mainPagerAdapter
        viewPager.offscreenPageLimit = 3
    }
}
